(ns culture.facts
  "Country-level regional-culture catalog for Nigeria (NGA) -- national
  dishes, protected products, beverages, crafts, festivals and heritage
  sites, per ADR-2607171400 addendum 2 (cloud-itonami-municipality-
  culture-catalog Wave 1, in com-junkawasaki/root). Sibling namespace to
  `marketentry.facts` / `statute.facts` (ADR-2607141700); city-level
  counterparts live in the cloud-itonami-municipality-* repos.

  Catalog is keyed by UPPERCASE ISO3 (mirrors `statute.facts`); entries
  carry no :culture/municipality (that attribute is city-level only).

  Every entry cites a source URL that was actually fetched and read on
  :culture/retrieved-at -- never fabricated. Summaries state only what the
  cited source confirms. An item not in this table has NO spec-basis, full
  stop; extend `catalog`, do not invent an id/url.")

(def catalog
  "iso3 -> vector of culture entries."
  {"NGA"
   [{:culture/id "nga.dish.jollof-rice"
     :culture/name "Jollof rice"
     :culture/country "NGA"
     :culture/kind :dish
     :culture/summary "West African rice dish with disputed origins; Wikipedia identifies Senegal as the historical source, while Nigeria is known for a distinct regional variation and the long-running \"Jollof Wars\" rivalry with Ghana over whose version is best."
     :culture/url "https://en.wikipedia.org/wiki/Jollof_rice"
     :culture/url-provenance :wikipedia-en
     :culture/retrieved-at "2026-07-17"}
    {:culture/id "nga.dish.suya"
     :culture/name "Suya"
     :culture/country "NGA"
     :culture/kind :dish
     :culture/summary "Traditional Hausa smoke-grilled spiced meat on skewers, with place of origin Nigeria; described as having become a Nigerian national dish."
     :culture/url "https://en.wikipedia.org/wiki/Suya"
     :culture/url-provenance :wikipedia-en
     :culture/retrieved-at "2026-07-17"}
    {:culture/id "nga.dish.egusi"
     :culture/name "Egusi"
     :culture/country "NGA"
     :culture/kind :dish
     :culture/summary "Protein-rich melon seeds used across West African cuisine, prepared as soup or stew; the article states egusi is common throughout Nigeria and rooted in Yoruba culinary tradition."
     :culture/url "https://en.wikipedia.org/wiki/Egusi"
     :culture/url-provenance :wikipedia-en
     :culture/retrieved-at "2026-07-17"}
    {:culture/id "nga.dish.pounded-yam"
     :culture/name "Pounded yam"
     :culture/country "NGA"
     :culture/kind :dish
     :culture/summary "Nigerian swallow food made by pounding boiled yam with a mortar and pestle, a staple among the Hausa, Igbo and Yoruba peoples, eaten with soups such as egusi or okra soup."
     :culture/url "https://en.wikipedia.org/wiki/Pounded_yam"
     :culture/url-provenance :wikipedia-en
     :culture/retrieved-at "2026-07-17"}
    {:culture/id "nga.beverage.chapman"
     :culture/name "Chapman"
     :culture/country "NGA"
     :culture/kind :beverage
     :culture/summary "Non-alcoholic mixed drink originating in Nigeria, believed created at the Ikoyi Club in Lagos by bartender Samuel Alamutu; widely described as Nigeria's favourite drink."
     :culture/url "https://en.wikipedia.org/wiki/Chapman_(drink)"
     :culture/url-provenance :wikipedia-en
     :culture/retrieved-at "2026-07-17"}
    {:culture/id "nga.craft.adire"
     :culture/name "Adire"
     :culture/name-local "Àdìrẹ"
     :culture/country "NGA"
     :culture/kind :craft
     :culture/summary "Resist-dyed cloth traditionally made by Yoruba women in south-western Nigeria, using techniques such as tying and cassava-paste stencilling; Abeokuta is considered the capital of adire-making."
     :culture/url "https://en.wikipedia.org/wiki/Adire_(textile_art)"
     :culture/url-provenance :wikipedia-en
     :culture/retrieved-at "2026-07-17"}
    {:culture/id "nga.festival.eyo"
     :culture/name "Eyo festival"
     :culture/name-local "Adamu Orisha Play"
     :culture/country "NGA"
     :culture/kind :festival
     :culture/summary "Yoruba festival unique to Lagos, Nigeria, historically a secret-society ritual to escort a departed king's soul to the afterlife and usher in a new leader, now also presented as a tourist event."
     :culture/url "https://en.wikipedia.org/wiki/Eyo_festival"
     :culture/url-provenance :wikipedia-en
     :culture/retrieved-at "2026-07-17"}
    {:culture/id "nga.heritage.osun-osogbo-sacred-grove"
     :culture/name "Osun-Osogbo Sacred Grove"
     :culture/country "NGA"
     :culture/kind :heritage
     :culture/summary "Sacred grove along the Osun river outside Osogbo, Osun State, Nigeria, inscribed as a UNESCO World Heritage Site in 2005 for its cultural significance."
     :culture/url "https://en.wikipedia.org/wiki/Osun-Osogbo_Sacred_Grove"
     :culture/url-provenance :wikipedia-en
     :culture/retrieved-at "2026-07-17"}]})

(defn spec-basis [iso3] (get catalog iso3))

(defn coverage
  ([] (coverage (keys catalog)))
  ([iso3s]
   (let [have (filter catalog iso3s)
         missing (remove catalog iso3s)]
     {:requested (count iso3s)
      :covered (count have)
      :covered-jurisdictions (vec (sort have))
      :missing-jurisdictions (vec (sort missing))
      :note (str "cloud-itonami-iso3166-nga culture catalog "
                 "(ADR-2607171400 addendum 2, Wave 1): " (count (get catalog "NGA"))
                 " NGA entries, each with a fetched-and-read citation. "
                 "Extend `culture.facts/catalog`, never fabricate an id/url.")})))

(defn by-kind [iso3 kind]
  (filterv #(= (:culture/kind %) kind) (spec-basis iso3)))
