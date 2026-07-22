(ns marketentry.facts
  "Nigeria (NGA) market-entry regulatory catalog -- the spec-basis table
  the Market-Entry Compliance Governor checks every `:jurisdiction/assess`
  proposal against ('did the advisor cite an OFFICIAL public source for
  this jurisdiction's requirements, or did it invent one?').

  Fact-audit correction pass (2026-07-22/23), replacing an earlier,
  staler seed:

  - **Procurement law: Public Procurement Act 2007 -- CONFIRMED still
    the governing statute.** It establishes both the National Council on
    Public Procurement (policy/oversight) and the Bureau of Public
    Procurement (BPP, day-to-day regulator, own site bpp.gov.ng). An
    amendment bill has passed first reading in the Senate but is NOT yet
    law as of this catalog's research -- PPA 2007 remains current; this
    catalog does not cite the pending bill as if it were in force.

  - **NOCOPO is real and correctly named -- 'Nigeria Open Contracting
    Portal', established under PPA 2007 Section 5(r), launched 2017,
    fulfilling Nigeria's Open Government Partnership commitment NG0016.**
    An earlier version of this catalog mischaracterized NOCOPO as a
    'registration'/e-procurement system. **Correction: NOCOPO is a
    public DISCLOSURE/TRANSPARENCY portal** (publishes procurement
    plans, tender notices, contract awards, OCDS-conformant data) --
    it is NOT confirmed as a transactional bidding/supplier-registration
    system, so `:national-spec`/`:required-evidence` below no longer
    describe it as one. BPP separately began building a distinct e-GP
    (electronic Government Procurement) transactional system starting
    2018; that system's completeness/name is NOT independently confirmed
    here and this catalog does not assert specifics about it (an honest
    gap, not resolved by guessing).

  - **Business registration: Corporate Affairs Commission (CAC) under
    the Companies and Allied Matters Act (CAMA 2020) -- CONFIRMED
    current.** Digital-first registration via the Company Registration
    Portal (icrp.cac.gov.ng). Local companies: NGN 100,000 minimum share
    capital; companies with foreign participation: NGN 100,000,000
    minimum share capital.

  - **CORRECTION (the single highest-priority fix in this pass): FIRS
    (Federal Inland Revenue Service) has been renamed/reconstituted as
    the Nigeria Revenue Service (NRS)**, under the Nigeria Revenue
    Service (Establishment) Act 2025, signed June 2025, effective
    2026-01-01. The catalog's prior 'FIRS TIN record' / 'CAC / FIRS'
    citations were STALE as of this pass and are corrected to NRS below.
    TIN is now issued automatically on CAC-incorporation approval via
    CAC<->NRS integration (for companies, the CAC registration number
    now directly serves as the corporate Tax ID in many cases),
    retrievable at taxid.nrs.gov.ng. The firs.gov.ng -> nrs.gov.ng
    domain migration corroborates the rename. This catalog does NOT
    independently re-fetch nrs.gov.ng/taxid.nrs.gov.ng in this pass
    (an honest gap on primary-source re-verification of the new
    domain's own content) -- the rename itself (governing Act, name,
    effective date, domain migration) is treated as confirmed per the
    task-level verified-facts brief this catalog was corrected against.

  - **Newly added: foreign-investor registration via the Nigerian
    Investment Promotion Commission (NIPC) Act, Cap. N117 LFN 2004.**
    Section 20 requires every enterprise with foreign participation to
    register with NIPC (an online portal, no physical office visit)
    AFTER CAC incorporation and BEFORE commencing operations. The NIPC
    Act permits up to 100% foreign equity except the Section 31
    'negative list' (arms/ammunition/narcotics and related activities).
    This entry was entirely absent from the prior catalog. No NIPC
    website URL is independently fetched/cited in this pass -- an
    honest gap; `:foreign-investor-provenance` below cites the statute
    itself, not a guessed URL.

  - **Removed: unlabeled USA/KEN/GHA entries.** They were byte-identical
    to boilerplate found copy-pasted across ~75 unrelated
    cloud-itonami-iso3166-* sibling repos' own `facts.cljc` (scaffold
    contamination), with no grounding in this repo's own README/docs --
    removed rather than kept as unverified filler.

  An entry not in `catalog` has NO spec-basis, full stop; extend
  `catalog`, never invent an id/authority/url.")

(def catalog
  {"NGA" {:name "Nigeria"
          :owner-authority "Bureau of Public Procurement (BPP), the day-to-day regulator established (alongside the policy-level National Council on Public Procurement) under the Public Procurement Act 2007"
          :legal-basis "Public Procurement Act 2007 (an amendment bill has passed first reading in the Senate but is NOT yet law -- PPA 2007 remains the current governing statute)"
          :national-spec "BPP-administered procurement compliance; NOCOPO (Nigeria Open Contracting Portal, PPA 2007 Section 5(r), launched 2017) is a public DISCLOSURE/TRANSPARENCY portal (procurement plans, tender notices, contract awards, OCDS-conformant data) -- NOT confirmed as a transactional bidding/supplier-registration system. BPP separately began building a distinct e-GP transactional system from 2018; not independently confirmed complete or named here"
          :provenance "https://www.bpp.gov.ng/"
          :required-evidence ["CAC registration record (CAMA 2020)" "NRS Tax Identification Number (TIN) record (CAC<->NRS integration, taxid.nrs.gov.ng)" "Authorized-representative record"]
          :rep-owner-authority "contracting authorities / BPP"
          :rep-legal-basis "Nigerian legal entity (CAC) typically required for federal awards"
          :rep-provenance "https://www.bpp.gov.ng/"
          :corporate-number-owner-authority "Corporate Affairs Commission (CAC) / Nigeria Revenue Service (NRS)"
          :corporate-number-legal-basis "Nigeria Revenue Service (Establishment) Act 2025 (signed June 2025, effective 2026-01-01), which renamed/reconstituted the Federal Inland Revenue Service (FIRS) as the Nigeria Revenue Service (NRS) -- the corporate Tax ID (TIN) is now issued automatically on CAC-incorporation approval via CAC<->NRS integration; the CAC registration number itself now serves as the corporate Tax ID directly in many cases. Superseded, no-longer-current citation: 'FIRS TIN record' / 'CAC / FIRS' -- corrected here"
          :corporate-number-provenance "https://www.cac.gov.ng/ ; https://taxid.nrs.gov.ng/ (successor domain to firs.gov.ng)"
          :business-registration-owner-authority "Corporate Affairs Commission (CAC)"
          :business-registration-legal-basis "Companies and Allied Matters Act (CAMA 2020) -- digital-first registration via the Company Registration Portal; local companies: NGN 100,000 minimum share capital; companies with foreign participation: NGN 100,000,000 minimum share capital"
          :business-registration-provenance "https://icrp.cac.gov.ng/ ; https://www.cac.gov.ng/"
          :foreign-investor-owner-authority "Nigerian Investment Promotion Commission (NIPC)"
          :foreign-investor-legal-basis "Nigerian Investment Promotion Commission Act, Cap. N117 LFN 2004, Section 20 -- requires every enterprise with foreign participation to register with NIPC (online portal, no physical office visit) AFTER CAC incorporation and BEFORE commencing operations. Section 31 'negative list' (arms/ammunition/narcotics and related activities) is the only bar to up to 100% foreign equity"
          :foreign-investor-provenance "Nigerian Investment Promotion Commission Act, Cap. N117 LFN 2004 (Section 20, Section 31) -- statutory citation; no NIPC.gov.ng URL independently fetched this pass, an honest gap, not guessed"
          :tin-auto-issued-via-cac? true}})

(defn spec-basis [iso3] (get catalog iso3))
(defn coverage
  ([] (coverage (keys catalog)))
  ([iso3s]
   (let [have (filter catalog iso3s) missing (remove catalog iso3s)]
     {:requested (count iso3s) :covered (count have)
      :covered-jurisdictions (vec (sort have))
      :missing-jurisdictions (vec (sort missing))
      :note "cloud-itonami-iso3166-nga fact-audit pass (2026-07-22/23): 1 jurisdiction (NGA) seeded with an official spec-basis. Prior USA/KEN/GHA entries were unlabeled scaffold contamination (byte-identical boilerplate found copy-pasted across ~75 unrelated cloud-itonami-iso3166-* sibling repos, with no grounding in this repo's own README/docs) and have been removed. Extend `marketentry.facts/catalog`, never fabricate a jurisdiction's requirements."})))
(defn required-evidence-satisfied? [iso3 submitted]
  (when-let [{:keys [required-evidence]} (spec-basis iso3)]
    (= (count required-evidence) (count (filter (set submitted) required-evidence)))))
(defn evidence-checklist [iso3] (:required-evidence (spec-basis iso3) []))
(defn rep-spec-basis [iso3]
  (when-let [sb (spec-basis iso3)]
    (when (:rep-owner-authority sb)
      (select-keys sb [:rep-owner-authority :rep-legal-basis :rep-provenance]))))
(defn corporate-number-spec-basis [iso3]
  (when-let [sb (spec-basis iso3)]
    (when (:corporate-number-owner-authority sb)
      (select-keys sb [:corporate-number-owner-authority :corporate-number-legal-basis :corporate-number-provenance]))))
(defn business-registration-spec-basis
  "The jurisdiction's business (CAC/CAMA) registration regime, or nil."
  [iso3]
  (when-let [sb (spec-basis iso3)]
    (when (:business-registration-owner-authority sb)
      (select-keys sb [:business-registration-owner-authority :business-registration-legal-basis :business-registration-provenance]))))
(defn foreign-investor-spec-basis
  "The jurisdiction's foreign-investor (NIPC) registration regime, or
  nil. Newly added for NGA -- see namespace docstring."
  [iso3]
  (when-let [sb (spec-basis iso3)]
    (when (:foreign-investor-owner-authority sb)
      (select-keys sb [:foreign-investor-owner-authority :foreign-investor-legal-basis :foreign-investor-provenance]))))
