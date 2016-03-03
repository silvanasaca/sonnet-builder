;; gorilla-repl.fileformat = 1

;; @@
(ns sonnet-builder.core
  (:gen-class)
  )
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}
;; <=

;; @@
(defn syllable-counter
  [word-map]
  (reduce + (map :syllables word-map))
  )
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;sonnet-builder.core/syllable-counter</span>","value":"#'sonnet-builder.core/syllable-counter"}
;; <=

;; @@
(syllable-counter
  [{:word "trees" :syllables 1}
   {:word "grow" :syllables 1}
   {:word "slowly" :syllables 2}])
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-long'>4</span>","value":"4"}
;; <=

;; @@
(def first-phrase [{:word "The" :syllables 1}
                   {:word "Remember my" :syllables 4}
                   {:word "A" :syllables 1}
                   {:word "To" :syllables 1}
                   {:word "Through the" :syllables 2}
                   {:word "When" :syllables 1}
                   {:word "As" :syllables 1}
                   {:word "Between the" :syllables 3}
                   {:word "Because" :syllables 2}
                   {:word "Amidst the" :syllables 3}
                   {:word "From" :syllables 1}
                   
                   ])
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;sonnet-builder.core/first-phrase</span>","value":"#'sonnet-builder.core/first-phrase"}
;; <=

;; @@
(def stressed-start-noun [
                           ;;NOUNS 

                           ;1 syllable nouns 
                           {:word "day" :syllables 1 :type "noun"}
                           {:word "night" :syllables 1 :type "noun"}
                           {:word "bird" :syllables 1 :type "noun"}
                           {:word "song" :syllables 1 :type "noun"}
                           {:word "weeds" :syllables 1 :type "noun"}
                           {:word "match" :syllables 1 :type "noun"}
                           {:word "light" :syllables 1 :type "noun"}
                           {:word "fire" :syllables 1 :type "noun"}
                           {:word "path" :syllables 1 :type "noun"}
                           {:word "wall" :syllables 1 :type "noun"}
                           {:word "tree" :syllables 1 :type "noun"}
                           {:word "smells" :syllables 1 :type "noun"}
                           {:word "pace" :syllables 1 :type "noun"}
                           {:word "bed" :syllables 1 :type "noun"}
                           {:word "dream" :syllables 1 :type "noun"}
                           {:word "rain" :syllables 1 :type "noun"}
                           {:word "Sun" :syllables 1 :type "noun"}
                           {:word "moon" :syllables 1 :type "noun"}
                           {:word "pond" :syllables 1 :type "noun"}
                           {:word "life" :syllables 1 :type "noun"}
                           {:word "death" :syllables 1 :type "noun"}
                           {:word "church" :syllables 1 :type "noun"}
                           {:word "grass" :syllables 1 :type "noun"}
                           {:word "gun" :syllables 1 :type "noun"}
                           {:word "stage" :syllables 1 :type "noun"}

                           ;2 syllable nouns 
                           {:word "plastic" :syllables 2 :type "noun"}
                           {:word "cages" :syllables 2 :type "noun"}
                           {:word "waters" :syllables 2 :type "noun"}
                           {:word "shadows" :syllables 2 :type "noun"}
                           {:word "feeling" :syllables 2 :type "noun"}
                           {:word "flowers" :syllables 2 :type "noun"}
                           {:word "linings" :syllables 2 :type "noun"}
                           {:word "phoenix" :syllables 2 :type "noun"}
                           {:word "summer" :syllables 2 :type "noun"}
                           {:word "winter" :syllables 2 :type "noun"}
                           {:word "autumn" :syllables 2 :type "noun"}
                           {:word "slivers" :syllables 2 :type "noun"}
                           {:word "magic" :syllables 2 :type "noun"}
                           {:word "eon" :syllables 2 :type "noun"}
                           {:word "moonlight" :syllables 2 :type "noun"}
                           {:word "chimney" :syllables 2 :type "noun"}
                           {:word "decade" :syllables 2 :type "noun"}
                           {:word "candor" :syllables 2 :type "noun"}
                           {:word "Other" :syllables 2 :type "noun"}
                           {:word "camel" :syllables 2 :type "noun"}
                           {:word "woman" :syllables 2 :type "noun"}
                           {:word "candle" :syllables 2 :type "noun"}
                           {:word "giants" :syllables 2 :type "noun"}
                           {:word "future" :syllables 2 :type "noun"}
                           {:word "lampshade" :syllables 2 :type "noun"}
                           {:word "nightshade" :syllables 2 :type "noun"}
                           {:word "lady" :syllables 2 :type "noun"}
                           {:word "beauty" :syllables 2 :type "noun"}
                           {:word "liars" :syllables 2 :type "noun"}
                           {:word "tigers" :syllables 2 :type "noun"}
                           {:word "lions" :syllables 2 :type "noun"}
                           {:word "leopards" :syllables 2 :type "noun"}
                           {:word "lepers" :syllables 2 :type "noun"}
                           {:word "blossoms" :syllables 2 :type "noun"}
                           {:word "pieces" :syllables 2 :type "noun"}
                           {:word "triggers" :syllables 2 :type "noun"}
                           {:word "moments" :syllables 2 :type "noun"}
                           {:word "puzzle" :syllables 2 :type "noun"}
                           {:word "Heaven" :syllables 2 :type "noun"}
                           {:word "shoulder" :syllables 2 :type "noun"}
                           {:word "soldier" :syllables 2 :type "noun"}
                           {:word "whisper" :syllables 2 :type "noun"}
                           {:word "silence" :syllables 2 :type "noun"}
                           {:word "fashion" :syllables 2 :type "noun"}
                           {:word "martyr" :syllables 2 :type "noun"}
                           {:word "finger" :syllables 2 :type "noun"}
                           {:word "caverns" :syllables 2 :type "noun"}
                           {:word "thickness" :syllables 2 :type "noun"}
                           {:word "airplanes" :syllables 2 :type "noun"}
                           {:word "pockets" :syllables 2 :type "noun"}
                           {:word "children" :syllables 2 :type "noun"}
                           {:word "orchid" :syllables 2 :type "noun"}
                           {:word "nothing" :syllables 2 :type "noun"}
                           {:word "something" :syllables 2 :type "noun"}
                           {:word "mountains" :syllables 2 :type "noun"}
                           {:word "forest" :syllables 2 :type "noun"}
                           {:word "ocean" :syllables 2 :type "noun"}
                           {:word "motion" :syllables 2 :type "noun"}
                           {:word "daydream" :syllables 2 :type "noun"}
                           {:word "mama" :syllables 2 :type "noun"}
                           {:word "papa" :syllables 2 :type "noun"}
                           {:word "mother" :syllables 2 :type "noun"}
                           {:word "father" :syllables 2 :type "noun"}
                           {:word "ray-gun" :syllables 2 :type "noun"}
                           {:word "stardust" :syllables 2 :type "noun"}
                           {:word "machine" :syllables 2 :type "noun"}
                           {:word "doses" :syllables 2 :type "noun"}
                           {:word "genie" :syllables 2 :type "noun"}
                           {:word "master" :syllables 2 :type "noun"}
                           {:word "odor" :syllables 2 :type "noun"}
                           {:word "cologne" :syllables 2 :type "noun"}
                           {:word "caress" :syllables 2 :type "noun"}
                           {:word "river" :syllables 2 :type "noun"}
                           {:word "body" :syllables 2 :type "noun"}
                           {:word "landfill" :syllables 2 :type "noun"}
                           {:word "handshake" :syllables 2 :type "noun"}
                           {:word "carbon" :syllables 2 :type "noun"}
                           {:word "garden" :syllables 2 :type "noun"}
                           {:word "silence" :syllables 2 :type "noun"}
                           {:word "battle" :syllables 2 :type "noun"}
                           {:word "fall-out" :syllables 2 :type "noun"}
                           {:word "glasshouse" :syllables 2 :type "noun"}
                           {:word "glassware" :syllables 2 :type "noun"}
                           {:word "weekend" :syllables 2 :type "noun"}
                           {:word "paper" :syllables 2 :type "noun"}
                           {:word "phantom" :syllables 2 :type "noun"}
                           {:word "spectre" :syllables 2 :type "noun"}
                           {:word "starlight" :syllables 2 :type "noun"}
                           {:word "humor" :syllables 2 :type "noun"}
                           {:word "giggle" :syllables 2 :type "noun"}
                           {:word "worship" :syllables 2 :type "noun"}
                           {:word "commands" :syllables 2 :type "noun"}
                           {:word "offer" :syllables 2 :type "noun"}
                           {:word "heartbeat" :syllables 2 :type "noun"}
                           {:word "pagan" :syllables 2 :type "noun"}
                           {:word "lover" :syllables 2 :type "noun"}
                           {:word "goddess" :syllables 2 :type "noun"}
                           {:word "stable" :syllables 2 :type "noun"}
                           {:word "Faithful" :syllables 2 :type "noun"}
                           {:word "rumours" :syllables 2 :type "noun"}
                           {:word "human" :syllables 2 :type "noun"}
                           {:word "mouth-piece" :syllables 2 :type "noun"}
                           
                           
                           ;3 syllable nouns
                           {:word "yesterday" :syllables 3 :type "noun"}
                           {:word "chocolate" :syllables 3 :type "noun"}
                           {:word "cavalry" :syllables 3 :type "noun"}
                           {:word "universe" :syllables 3 :type "noun"}
                           {:word "images" :syllables 3 :type "noun"}
                           {:word "innocent" :syllables 3 :type "noun"}
                           
                           
                           ;4 syllable nouns
                           {:word "fire-breather" :syllables 3 :type "noun"}




                           ;;ADJECTIVES

                           ;1 syllable adjectives
                           {:word "red" :syllables 1 :type "adj"}
                           {:word "blue" :syllables 1 :type "adj"}
                           {:word "green" :syllables 1 :type "adj"}
                           {:word "hard" :syllables 1 :type "adj"}
                           {:word "soft" :syllables 1 :type "adj"}
                           {:word "light" :syllables 1 :type "adj"}
                           {:word "dark" :syllables 1 :type "adj"}
                           {:word "cool" :syllables 1 :type "adj"}                        
                           {:word "warm" :syllables 1 :type "adj"}
                           {:word "cold" :syllables 1 :type "adj"}
                           {:word "bright" :syllables 1 :type "adj"}                      
                           {:word "large" :syllables 1 :type "adj"}
                           {:word "small" :syllables 1 :type "adj"}
                           {:word "vast" :syllables 1 :type "adj"}
                           {:word "fair" :syllables 1 :type "adj"}
                           {:word "chipped" :syllables 1 :type "adj"}
                           {:word "glad" :syllables 1 :type "adj"}
                           {:word "mad" :syllables 1 :type "adj"}
                           {:word "quaint" :syllables 1 :type "adj"}
                           {:word "queer" :syllables 1 :type "adj"}
                           {:word "real" :syllables 1 :type "adj"}
                           {:word "strange" :syllables 1 :type "adj"}
                           {:word "loud" :syllables 1 :type "adj"}
                           {:word "wide" :syllables 1 :type "adj"}
                           {:word "shy" :syllables 1 :type "adj"}
                           {:word "calm" :syllables 1 :type "adj"}
                           {:word "sage" :syllables 1 :type "adj"}
                           {:word "dead" :syllables 1 :type "adj"}
                           {:word "pink" :syllables 1 :type "adj"}
                           {:word "brave" :syllables 1 :type "adj"}
                           {:word "fine" :syllables 1 :type "adj"}
                           {:word "free" :syllables 1 :type "adj"}
                           {:word "thick" :syllables 1 :type "adj"}
                           {:word "cramped" :syllables 1 :type "adj"}
                           {:word "first" :syllables 1 :type "adj"}
                           {:word "last" :syllables 1 :type "adj"}
                           {:word "fixed" :syllables 1 :type "adj"}
                           {:word "slow" :syllables 1 :type "adj"}
                           {:word "fast" :syllables 1 :type "adj"}
                           {:word "showed" :syllables 1 :type "adj"}
                           {:word "third" :syllables 1 :type "adj"}
                           {:word "coiled" :syllables 1 :type "adj"}
                           {:word "crushed" :syllables 1 :type "adj"}
                           {:word "crisp" :syllables 1 :type "adj"}
                           {:word "black" :syllables 1 :type "adj"}
                           {:word "white" :syllables 1 :type "adj"}
                           {:word "clean" :syllables 1 :type "adj"}
                           {:word "drab" :syllables 1 :type "adj"}
                           {:word "tall" :syllables 1 :type "adj"}
                           {:word "old" :syllables 1 :type "adj"}
                           {:word "young" :syllables 1 :type "adj"}
                           {:word "burned" :syllables 1 :type "adj"}
                           {:word "spoiled" :syllables 1 :type "adj"}
                           {:word "carved" :syllables 1 :type "adj"}
                           {:word "starved" :syllables 1 :type "adj"}
                           {:word "tough" :syllables 1 :type "adj"}
                           {:word "far" :syllables 1 :type "adj"}
                           {:word "close" :syllables 1 :type "adj"}
                           {:word "strange" :syllables 1 :type "adj"}
                           {:word "big" :syllables 1 :type "adj"}
                           {:word "fresh" :syllables 1 :type "adj"}
                           {:word "based" :syllables 1 :type "adj"}
                           {:word "clasped" :syllables 1 :type "adj"}
                           {:word "gold" :syllables 1 :type "adj"}
                           {:word "glued" :syllables 1 :type "adj"}
                           {:word "spaced" :syllables 1 :type "adj"}
                           {:word "traced" :syllables 1 :type "adj"}
                           {:word "patched" :syllables 1 :type "adj"}
                           {:word "sweet" :syllables 1 :type "adj"}
                           {:word "sour" :syllables 1 :type "adj"}
                           {:word "dour" :syllables 1 :type "adj"}


                           ;2 syllable adjectives
                           {:word "heavy" :syllables 2 :type "adj"}
                           {:word "golden" :syllables 2 :type "adj"}
                           {:word "rampant" :syllables 2 :type "adj"}
                           {:word "streaming" :syllables 2 :type "adj"}
                           {:word "dancing" :syllables 2 :type "adj"}
                           {:word "slanted" :syllables 2 :type "adj"}
                           {:word "dated" :syllables 2 :type "adj"}
                           {:word "maddened" :syllables 2 :type "adj"}                    
                           {:word "crazy" :syllables 2 :type "adj"}
                           {:word "wild" :syllables 2 :type "adj"}
                           {:word "tragic" :syllables 2 :type "adj"}                      
                           {:word "frightened" :syllables 2 :type "adj"}
                           {:word "drooping" :syllables 2 :type "adj"}
                           {:word "dripping" :syllables 2 :type "adj"}                    
                           {:word "violent" :syllables 2 :type "adj"}
                           {:word "violet" :syllables 2 :type "adj"}
                           {:word "yellow" :syllables 2 :type "adj"}                      
                           {:word "orange" :syllables 2 :type "adj"}
                           {:word "worldly" :syllables 2 :type "adj"}
                           {:word "hateful" :syllables 2 :type "adj"}                    
                           {:word "solemn" :syllables 2 :type "adj"}
                           {:word "hungry" :syllables 2 :type "adj"}
                           {:word "Martian" :syllables 2 :type "adj"}
                           {:word "shifting" :syllables 2 :type "adj"}
                           {:word "lunar" :syllables 2 :type "adj"}
                           {:word "mazy" :syllables 2 :type "adj"}
                           {:word "lonely" :syllables 2 :type "adj"}
                           {:word "only" :syllables 2 :type "adj"}
                           {:word "open" :syllables 2 :type "adj"}
                           {:word "downwards" :syllables 2 :type "adj"}
                           {:word "closing" :syllables 2 :type "adj"}
                           {:word "ripping" :syllables 2 :type "adj"}
                           {:word "healing" :syllables 2 :type "adj"}
                           {:word "pretty" :syllables 2 :type "adj"}                    
                           {:word "dreamy" :syllables 2 :type "adj"}
                           {:word "dreary" :syllables 2 :type "adj"}
                           {:word "tumbling" :syllables 2 :type "adj"}                   
                           {:word "breezing" :syllables 2 :type "adj"}
                           {:word "gentle" :syllables 2 :type "adj"}
                           {:word "fretful" :syllables 2 :type "adj"}                    
                           {:word "wavy" :syllables 2 :type "adj"}
                           {:word "folded" :syllables 2 :type "adj"}
                           {:word "crippling" :syllables 2 :type "adj"}                  
                           {:word "neon" :syllables 2 :type "adj"}
                           {:word "silver" :syllables 2 :type "adj"}
                           {:word "longing" :syllables 2 :type "adj"}                    
                           {:word "naked" :syllables 2 :type "adj"}
                           {:word "wasted" :syllables 2 :type "adj"}
                           {:word "peaceful" :syllables 2 :type "adj"}
                           {:word "basic" :syllables 2 :type "adj"}
                           {:word "airy" :syllables 2 :type "adj"}
                           {:word "drafty" :syllables 2 :type "adj"}
                           {:word "crafty" :syllables 2 :type "adj"}
                           {:word "threading" :syllables 2 :type "adj"}
                           {:word "weaving" :syllables 2 :type "adj"}
                           {:word "melting" :syllables 2 :type "adj"}
                           {:word "humming" :syllables 2 :type "adj"}
                           {:word "buzzing" :syllables 2 :type "adj"}
                           {:word "twisting" :syllables 2 :type "adj"}
                           {:word "rosy" :syllables 2 :type "adj"}                    
                           {:word "starry" :syllables 2 :type "adj"}
                           {:word "warning" :syllables 2 :type "adj"}
                           {:word "shallow" :syllables 2 :type "adj"}                   
                           {:word "blooming" :syllables 2 :type "adj"}
                           {:word "booming" :syllables 2 :type "adj"}
                           {:word "frozen" :syllables 2 :type "adj"}                    
                           {:word "broken" :syllables 2 :type "adj"}
                           {:word "yawning" :syllables 2 :type "adj"}
                           {:word "smoking" :syllables 2 :type "adj"}                    
                           {:word "darling" :syllables 2 :type "adj"}
                           {:word "writhing" :syllables 2 :type "adj"}
                           {:word "toothless" :syllables 2 :type "adj"}                  
                           {:word "choking" :syllables 2 :type "adj"}
                           {:word "fearful" :syllables 2 :type "adj"}
                           {:word "empty" :syllables 2 :type "adj"}
                           {:word "bitter" :syllables 2 :type "adj"}
                           {:word "braided" :syllables 2 :type "adj"}
                           {:word "frenzied" :syllables 2 :type "adj"}
                           {:word "kneading" :syllables 2 :type "adj"}
                           {:word "restless" :syllables 2 :type "adj"}
                           {:word "swaddling" :syllables 2 :type "adj"}
                           {:word "sinking" :syllables 2 :type "adj"}
                           {:word "knee-deep" :syllables 2 :type "adj"}
                           {:word "snow white" :syllables 2 :type "adj"}
                           {:word "fickle" :syllables 2 :type "adj"}
                           {:word "common" :syllables 2 :type "adj"}                    
                           {:word "lukewarm" :syllables 2 :type "adj"}
                           {:word "blinded" :syllables 2 :type "adj"}
                           {:word "soaked" :syllables 2 :type "adj"}                   
                           {:word "soggy" :syllables 2 :type "adj"}
                           {:word "dangling" :syllables 2 :type "adj"}
                           {:word "cherry" :syllables 2 :type "adj"}                    
                           {:word "tidal" :syllables 2 :type "adj"}
                           {:word "pregnant" :syllables 2 :type "adj"}
                           {:word "bellow" :syllables 2 :type "adj"}                  
                           {:word "sweetest" :syllables 2 :type "adj"}
                           {:word "wax-white" :syllables 2 :type "adj"}
                           {:word "endless" :syllables 2 :type "adj"}                    
                           {:word "hollow" :syllables 2 :type "adj"}
                           {:word "higher" :syllables 2 :type "adj"}
                           {:word "poison" :syllables 2 :type "adj"}
                           {:word "bony" :syllables 2 :type "adj"}
                           {:word "stony" :syllables 2 :type "adj"}
                           {:word "starving" :syllables 2 :type "adj"}
                            
                            
                           ;3 syllable adjectives
                           {:word "murmuring" :syllables 3 :type "adj"}
                           
                           
                           ;4 syllable adjectives   
                           {:word "underwater" :syllables 4 :type "adj"}
                           {:word "resonating" :syllables 4 :type "adj"}
                           {:word "spiraling" :syllables 4 :type "adj"}
                           {:word "wishy-washy" :syllables 4 :type "adj"}
                           {:word "spiraling" :syllables 4 :type "adj"}
                           {:word "beflowering" :syllables 4 :type "adj"}
                           
                           
                           ;; VERBS
                           
                           


                          ])
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;sonnet-builder.core/stressed-start-noun</span>","value":"#'sonnet-builder.core/stressed-start-noun"}
;; <=

;; @@
(def unstressed-start-noun [{:word "and" :syllables 1 :type "conj"}
                            {:word "to" :syllables 1 :type "conj"}
                            
                            ; 2 syllable nouns
                         
                            
                            {:word "mirage" :syllables 2 :type "noun"}
                            {:word "abyss" :syllables 2 :type "noun"}
                            {:word "cocoon" :syllables 2 :type "noun"}
                            {:word "collage" :syllables 2 :type "noun"}
                            {:word "champagne" :syllables 2 :type "noun"}
                            {:word "brigade" :syllables 2 :type "noun"}
                            {:word "mimosas" :syllables 2 :type "noun"}
                            {:word "today" :syllables 2 :type "noun"}             
                            {:word "escape" :syllables 2 :type "noun"}
                            {:word "ballet" :syllables 2 :type "noun"}
                            {:word "delay" :syllables 2 :type "noun"}
                            {:word "canal" :syllables 2 :type "noun"}
                            {:word "cascade" :syllables 2 :type "noun"}
                            {:word "cigar" :syllables 2 :type "noun"}
                            {:word "cologne" :syllables 2 :type "noun"}
                            {:word "debate" :syllables 2 :type "noun"}
                            {:word "cuisine" :syllables 2 :type "noun"}
                            {:word "design" :syllables 2 :type "noun"}
                            {:word "devout" :syllables 2 :type "noun"}
                            {:word "dismay" :syllables 2 :type "noun"}
                            {:word "duress" :syllables 2 :type "noun"}
                            {:word "eclipse" :syllables 2 :type "noun"}
                            {:word "effect" :syllables 2 :type "noun"}
                            {:word "taboo" :syllables 2 :type "noun"}                                               {:word "remark" :syllables 2 :type "noun"}
                            {:word "deprived" :syllables 2 :type "noun"}
                            {:word "depraved" :syllables 2 :type "noun"}
                            {:word "egress" :syllables 2 :type "noun"}
                            {:word "boudouir" :syllables 2 :type "noun"}
                            {:word "buffoon" :syllables 2 :type "noun"}
                            {:word "constraint" :syllables 2 :type "noun"}
                            {:word "chagrin" :syllables 2 :type "noun"}
                            {:word "charade" :syllables 2 :type "noun"}
                            {:word "façade" :syllables 2 :type "noun"}
                            {:word "amen" :syllables 2 :type "noun"}

                            
                            
                            
                            ; 3 syllable nouns
                            {:word "asbestos" :syllables 3 :type "noun"}
                            {:word "crescendo" :syllables 3 :type "noun"}
                            {:word "cerebrum" :syllables 3 :type "noun"}
                            {:word "exceptions" :syllables 3 :type "noun"}
                            {:word "tomorrow" :syllables 3 :type "noun"}
                            {:word "accomplice" :syllables 3 :type "noun"}
                            {:word "concerto" :syllables 3 :type "noun"}
                            {:word "elixir" :syllables 3 :type "noun"}
                            {:word "formation" :syllables 3 :type "noun"}
                            {:word "idea" :syllables 3 :type "noun"}
                            {:word "abandon" :syllables 3 :type "noun"}
                            {:word "conundrum" :syllables 3 :type "noun"}
                            {:word "enchantment" :syllables 3 :type "noun"}
                            {:word "relation" :syllables 3 :type "noun"}
                            {:word "containment" :syllables 3 :type "noun"}
                            {:word "carnation" :syllables 3 :type "noun"}
                            {:word "rotation" :syllables 3 :type "noun"}
                            {:word "elation" :syllables 3 :type "noun"}
                            {:word "canary" :syllables 3 :type "noun"}
                            {:word "clairvoyance" :syllables 3 :type "noun"}
                            {:word "commitment" :syllables 3 :type "noun"}
                            {:word "revolver" :syllables 3 :type "noun"}
                            
                            

                            ;4 syllable nouns 

                            {:word "conspiracies" :syllables 4 :type "noun"}
                            {:word "etcetera" :syllables 4 :type "noun"}
                            {:word "academy" :syllables 4 :type "noun"}
                            {:word "society" :syllables 4 :type "noun"}



                            ;;ADJECTIVES

                            ;1-syllable adjective
                            {:word "zen" :syllables 1 :type "adj"}


                            ;2 syllable adjectives
                            {:word "serene" :syllables 2 :type "adj"}
                            {:word "supreme" :syllables 2 :type "adj"}
                            {:word "enflamed" :syllables 2 :type "adj"}
                            {:word "obscured" :syllables 2 :type "adj"}
                            {:word "along" :syllables 2 :type "adj"}
                            {:word "unstressed" :syllables 2 :type "adj"}
                            {:word "undone" :syllables 2 :type "adj"}
                            {:word "undressed" :syllables 2 :type "adj"}
                            {:word "unveiled" :syllables 2 :type "adj"}
                            {:word "unkempt" :syllables 2 :type "adj"}

                            ;3 syllable adjectives
                            {:word "befallen" :syllables 3 :type "adj"}
                            {:word "nefarious" :syllables 3 :type "adj"}
                            {:word "enlightened" :syllables 3 :type "adj"}
                            {:word "delighted" :syllables 3 :type "adj"}
                            {:word "delightful" :syllables 3 :type "adj"}
                            {:word "enticing" :syllables 3 :type "adj"}
                            {:word "seductive" :syllables 3 :type "adj"}
                            {:word "exotic" :syllables 3 :type "adj"}
                            {:word "ebullient" :syllables 3 :type "adj"}
                            {:word "arisen" :syllables 3 :type "adj"}
                            {:word "surrounded" :syllables 3 :type "adj"}
                            {:word "mysterious" :syllables 3 :type "adj"}
                            {:word "beneath" :syllables 3 :type "adj"}
                            {:word "mysterious" :syllables 3 :type "adj"}


                            ;4 syllable adjectives
                            {:word "conspicuous" :syllables 4 :type "adj"}
                            {:word "evanescent" :syllables 4 :type "adj"}
                         

                            ])


;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;sonnet-builder.core/unstressed-start-noun</span>","value":"#'sonnet-builder.core/unstressed-start-noun"}
;; <=

;; @@
(:type (last unstressed-start-noun))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-string'>&quot;adj&quot;</span>","value":"\"adj\""}
;; <=

;; @@
;filters the next word through type and syllables
(defn filter-words
  [word-map threshold prev-word-type]
  (filter #(<= (:syllables %) threshold) word-map)
  (cond
    (= prev-word-type "adj") (filter #(= (:type %) "noun") word-map)
    (= prev-word-type "noun") (filter #(= (:type %) "adj") word-map)
    (= prev-word-type "conj") (filter #(= (:type %) "noun") word-map)
    (= prev-word-type "verb") (filter #(= (:type %) "conj") word-map)
    :else (filter #(= (:type %) "verb") word-map)))
  
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;sonnet-builder.core/filter-words</span>","value":"#'sonnet-builder.core/filter-words"}
;; <=

;; @@
(filter-words unstressed-start-noun 1 "verb")
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-lazy-seq'>(</span>","close":"<span class='clj-lazy-seq'>)</span>","separator":" ","items":[{"type":"list-like","open":"<span class='clj-map'>{</span>","close":"<span class='clj-map'>}</span>","separator":", ","items":[{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:word</span>","value":":word"},{"type":"html","content":"<span class='clj-string'>&quot;and&quot;</span>","value":"\"and\""}],"value":"[:word \"and\"]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:syllables</span>","value":":syllables"},{"type":"html","content":"<span class='clj-long'>1</span>","value":"1"}],"value":"[:syllables 1]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:type</span>","value":":type"},{"type":"html","content":"<span class='clj-string'>&quot;conj&quot;</span>","value":"\"conj\""}],"value":"[:type \"conj\"]"}],"value":"{:word \"and\", :syllables 1, :type \"conj\"}"},{"type":"list-like","open":"<span class='clj-map'>{</span>","close":"<span class='clj-map'>}</span>","separator":", ","items":[{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:word</span>","value":":word"},{"type":"html","content":"<span class='clj-string'>&quot;to&quot;</span>","value":"\"to\""}],"value":"[:word \"to\"]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:syllables</span>","value":":syllables"},{"type":"html","content":"<span class='clj-long'>1</span>","value":"1"}],"value":"[:syllables 1]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:type</span>","value":":type"},{"type":"html","content":"<span class='clj-string'>&quot;conj&quot;</span>","value":"\"conj\""}],"value":"[:type \"conj\"]"}],"value":"{:word \"to\", :syllables 1, :type \"conj\"}"}],"value":"({:word \"and\", :syllables 1, :type \"conj\"} {:word \"to\", :syllables 1, :type \"conj\"})"}
;; <=

;; @@
; Adds a word to the verse
(defn add-word
  [word-map threshold prev-word-type]
  (let [word
        (if (odd? (syllable-counter word-map))
          (rand-nth (filter-words stressed-start-noun threshold prev-word-type))
          (rand-nth (filter-words unstressed-start-noun threshold prev-word-type))
          )]
    (conj word-map word)
    
    ))


;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;sonnet-builder.core/add-word</span>","value":"#'sonnet-builder.core/add-word"}
;; <=

;; @@
; Writes a line in iambic pentameter. It prints when ten syllables are reached. Otherwise, words are added recursively. 
(defn verse-builder
  []
  
(loop [verse [(rand-nth first-phrase)]]
  (if (= (syllable-counter verse) 10)
    (apply str (interleave (map :word verse)
                           (repeat " ")))
           
         
    (recur (add-word verse (- 10 (syllable-counter verse)) (:type (last verse))) 
          ))))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;sonnet-builder.core/verse-builder</span>","value":"#'sonnet-builder.core/verse-builder"}
;; <=

;; @@
(verse-builder)
;; @@

;; @@
;Writes a sonnet using the verse builder.
(defn sonnet-writer
  []
  
  (doseq [verse (repeatedly 14 verse-builder)]
    (println verse)
    ))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;sonnet-builder.core/sonnet-writer</span>","value":"#'sonnet-builder.core/sonnet-writer"}
;; <=

;; @@

;; @@

;; @@
(type (sonnet-writer))
;; @@

;; @@

;; @@

;; @@

;; @@
