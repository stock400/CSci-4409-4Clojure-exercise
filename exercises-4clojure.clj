;;; Put your solutions to the assigned 4Clojure exercises here and commit
;;; back up to your fork on Github.

;;; What you enter is what whatever you'd put in the "Code which fills in the blank"
;;; box in 4Clojure. You're welcome to include other things here (helper definitions,
;;; scratch computations you found helpful, etc.), SO MAKE SURE YOU LABEL YOUR
;;; "ANSWERS" clearly.

;;; I've included a few examples below just to give you a sense of what I'm looking
;;; for.

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; Problem #162: Logical falsity and true

; What I pasted in the box:

1

; because all the given expressions returned 1, for example:

(= 1 (if [] 1 0))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; Problem #15: Double Down

; What I pasted in the box:

#(* 2 %)

; which is an anonymous function that doubles its argument, for example:

(= (#(* 2 %) 11) 22)

;;; Problem #10: Intro to Maps

20

; In both hash-maps, the key b will return 20

;;; Problem #16: Hello World

format "Hello, %s!"

; When using format, you provide a string and an agrument with %s being the location that the argument will be placed.

;;; Problem #17: Sequences: map

'(6 7 8)

; This map added five to each number in the sequence that was provided as the argument.
; So the new list becomes '(6 7 8).

;;; Problem #18: Sequences: filter

'(6 7)

; This filter is looking for any numbers in the provided sequence that are greater than 5.
; So the new list only contains 6 and 7.

;;; Problem #20: Penultimate Element

#(first (take-last 2 %))

; take-last takes the last n items out of a collection. In this case, I took out the last two items
; and then took out the first item out of the last two to get the second to last.

;;; Problem #21: Nth Element

(fn [seq n] (first (nthnext seq n)))

; nthnext takes the n next out of the sequence. So I use nthnext and take the first item out of the nthnext to get
; the nth.

;;; Problem #23: Reverse a sequence

#(reduce conj () %)

; conj items into a list puts them at the beginning of the list and reduce does the conjoining one item at a time.
; So this causes all the items to be reversed in the list.
