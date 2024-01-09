(defn send-osc-phrase [phrase]
  (case phrase
;intros
    :low-intro (osc/osc-send (:djlinktap @globals) "/phrase/1", (float 1))
    :mid-intro (osc/osc-send (:djlinktap @globals) "/phrase/1", (float 1))
    :high-intro-1 (osc/osc-send (:djlinktap @globals) "/phrase/1", (float 1))
    :high-intro-2 (osc/osc-send (:djlinktap @globals) "/phrase/2", (float 1))
;verses
    :low-verse-1 (osc/osc-send (:djlinktap @globals) "/phrase/3", (float 1))
    :mid-verse-1 (osc/osc-send (:djlinktap @globals) "/phrase/3", (float 1))
    :low-verse-2 (osc/osc-send (:djlinktap @globals) "/phrase/4", (float 1))
    :mid-verse-2 (osc/osc-send (:djlinktap @globals) "/phrase/4", (float 1))
    :mid-verse-3 (osc/osc-send (:djlinktap @globals) "/phrase/5", (float 1))
    :mid-verse-4 (osc/osc-send (:djlinktap @globals) "/phrase/6", (float 1))
    :mid-verse-5 (osc/osc-send (:djlinktap @globals) "/phrase/7", (float 1))
    :mid-verse-6 (osc/osc-send (:djlinktap @globals) "/phrase/8", (float 1))
;bridges
    :low-bridge (osc/osc-send (:djlinktap @globals) "/phrase/9", (float 1))
    :mid-bridge (osc/osc-send (:djlinktap @globals) "/phrase/9", (float 1))
;choruses
    :low-chorus (osc/osc-send (:djlinktap @globals) "/phrase/10", (float 1))
    :mid-chorus (osc/osc-send (:djlinktap @globals) "/phrase/10", (float 1))
    :high-chorus-1 (osc/osc-send (:djlinktap @globals) "/phrase/10", (float 1))
    :high-chorus-2 (osc/osc-send (:djlinktap @globals) "/phrase/11", (float 1))
;ups
    :high-up-1 (osc/osc-send (:djlinktap @globals) "/phrase/12", (float 1))
    :high-up-2 (osc/osc-send (:djlinktap @globals) "/phrase/13", (float 1))
    :high-up-3 (osc/osc-send (:djlinktap @globals) "/phrase/14", (float 1))
;down
    :high-down (osc/osc-send (:djlinktap @globals) "/phrase/15", (float 1))
;outros
    :low-outro (osc/osc-send (:djlinktap @globals) "/phrase/16", (float 1))
    :mid-outro (osc/osc-send (:djlinktap @globals) "/phrase/16", (float 1))
    :high-outro (osc/osc-send (:djlinktap @globals) "/phrase/16", (float 1))
    nil))
(defn send-osc-bank [bank]
  (case bank
    :cool (osc/osc-send (:djlinktap @globals) "/bank/1", (float 1))
    :natural (osc/osc-send (:djlinktap @globals) "/bank/2", (float 1))
    :hot (osc/osc-send (:djlinktap @globals) "/bank/3", (float 1))
    :subtle (osc/osc-send (:djlinktap @globals) "/bank/4", (float 1))
    :warm (osc/osc-send (:djlinktap @globals) "/bank/5", (float 1))
    :vivid (osc/osc-send (:djlinktap @globals) "/bank/6", (float 1))
    :club-1 (osc/osc-send (:djlinktap @globals) "/bank/7", (float 1))
    :club-2 (osc/osc-send (:djlinktap @globals) "/bank/8", (float 1))
    nil))

(defn send-osc-mood [trackMood]
 (case trackMood
    "ow" (osc/osc-send (:djlinktap @globals) "/mood/1", (float 1))
    "id" (osc/osc-send (:djlinktap @globals) "/mood/2", (float 1))
    "ig" (osc/osc-send (:djlinktap @globals) "/mood/3", (float 1))
nil))