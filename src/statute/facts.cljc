(ns statute.facts
  "General-law compliance catalog for Nigeria (NGA) -- a 40th country-level
  entry (see cloud-itonami-iso3166-jpn/-usa/-gbr/-deu/-fra/-can/-aus/-kor/
  -nld/-ita/-esp/-swe/-nor/-dnk/-fin/-prt/-bel/-bra/-mex/-chl/-arg/-zaf/-col/
  -ury/-cri/-pan/-ecu/-pry/-gtm/-hnd/-ind/-ken/-tha/-are/-vnm/-idn/-phl/-egy/
  -tur for the first thirty-nine) per ADR-2607141700
  (cloud-itonami-compliance-fact-federation).

  Reuses this tick-window's already-verified capital-status finding
  from cloud-itonami-municipality-nga-abuja (tick 116): Abuja replaced
  Lagos as Nigeria's capital on 12 December 1991, a fully completed
  historical transition with no ongoing ambiguity.

  Companies and Allied Matters Act, 2020 (CAMA 2020) -- title and 7
  August 2020 assent date confirmed via en.wikipedia.org's own
  infobox/introduction text (directly WebFetched and read) after two
  primary-source PDF attempts failed to yield a legible date:
  lawsofnigeria.placng.org's 'C20.pdf' turned out on inspection to be
  the older Cap. C20 Laws of the Federation codification (no visible
  2020-specific date on its arrangement-of-sections page), and
  icrp.cac.gov.ng's (Corporate Affairs Commission's own official
  domain) hosted PDF rendered the title page's date/reference line as
  illegible boxes via font-subsetting despite the page itself
  (including Nigeria's coat of arms) being otherwise visible. Multiple
  independent secondary sources (Wikipedia, Mondaq, ICNL) agree on 7
  August 2020, and Wikipedia's own page was the one directly read.

  Nigeria Data Protection Act, 2023 (NDPA 2023) -- title and 12 June
  2023 signing date directly confirmed via ndpc.gov.ng's (Nigeria
  Data Protection Commission, the official regulator's own government
  domain) 'About Us' page, which states verbatim: 'the Federal
  Government of Nigeria signed into law the Nigeria Data Protection
  Act 2023 (NDP Act) on June 12, 2023.' (cert.gov.ng's own hosted PDF
  of the Act returned HTTP 403 first.)

  An entry not in this table has NO spec-basis, full stop; extend
  `catalog`, do not invent an id/url/date.")

(def catalog
  "ISO3166 alpha-3 -> vector of statute entries."
  {"NGA"
   [{:statute/id "nga.cama-2020-companies-and-allied-matters-act"
     :statute/title "Companies and Allied Matters Act, 2020"
     :statute/jurisdiction "NGA"
     :statute/kind :law
     :statute/law-number "CAMA 2020"
     :statute/url "https://en.wikipedia.org/wiki/Companies_and_Allied_Matters_Act,_2020"
     :statute/url-provenance :wikipedia-corroborated
     :statute/enacted-date "2020-08-07"
     :statute/retrieved-at "2026-07-17"
     :statute/topic #{:corporate-governance :incorporation}}
    {:statute/id "nga.ndpa-2023-nigeria-data-protection-act"
     :statute/title "Nigeria Data Protection Act, 2023"
     :statute/jurisdiction "NGA"
     :statute/kind :law
     :statute/law-number "NDPA 2023"
     :statute/url "https://ndpc.gov.ng/about-us/"
     :statute/url-provenance :official-ndpc-gov-ng
     :statute/enacted-date "2023-06-12"
     :statute/retrieved-at "2026-07-17"
     :statute/topic #{:data-protection :privacy}}]})

(defn spec-basis [jurisdiction] (get catalog jurisdiction))

(defn coverage
  ([] (coverage (keys catalog)))
  ([jurisdictions]
   (let [have (filter catalog jurisdictions)
         missing (remove catalog jurisdictions)]
     {:requested (count jurisdictions)
      :covered (count have)
      :covered-jurisdictions (vec (sort have))
      :missing-jurisdictions (vec (sort missing))
      :note (str "cloud-itonami-iso3166-nga statute.facts Wave 0 (ADR-2607141700): "
                 (count (get catalog "NGA")) " Nigeria entries seeded "
                 "with ndpc.gov.ng/Wikipedia citations. "
                 "Extend `statute.facts/catalog`, never fabricate an id/url.")})))

(defn by-topic [jurisdiction topic]
  (filterv #(contains? (:statute/topic %) topic) (spec-basis jurisdiction)))
