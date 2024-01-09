(send-osc-phrase phrase-type)
(send-osc-bank track-bank)
(let [trackMood(subs (name phrase-type) 1 3)]
(send-osc-mood trackMood))
(let [trackPhrase (name phrase-type)]
(osc/osc-send (:djlinktap @globals) "/phrasefull", trackPhrase))