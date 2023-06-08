SUMMARY = "A library for property based testing"
DESCRIPTION = "Hypothesis is a family of testing libraries which let you write tests parametrized \
by a source of examples. A Hypothesis implementation then generates simple and \
comprehensible examples that make your tests fail. This simplifies writing your \
tests and makes them more powerful at the same time, by letting software automate \
the boring bits and do them to a higher standard than a human would, freeing you \
to focus on the higher level test logic. \
 \
This sort of testing is often called 'property-based testing', and the most widely \
known implementation of the concept is the Haskell library QuickCheck, but \
Hypothesis differs significantly from QuickCheck and is designed to fit idiomatically \
and easily into existing styles of testing that you are used to, with absolutely no \
familiarity with Haskell or functional programming needed."
LICENSE = "MPL-2.0"

PV = "6.61.2"

RPM_NAME = "python39-hypothesis-6.61.2-3.1.noarch.rpm"
RPM_HASH = "920af1400adc7f34dc9fed0f94144180340926694878dc6c0a1f8396ba38d3a9184dc0da13271954b202a05ddb7e8a992fe2e8033695eaa3f2da805727695e62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(hypothesis) python39-hypothesis python3dist(hypothesis)"
RDEPENDS:${PN} += "(python39-exceptiongroup >= 1.0.0 if python39-base < 3.11) (python39-sortedcontainers >= 2.1.0 with python39-sortedcontainers < 3.0) /bin/sh /usr/bin/python3.9 python(abi) python39-attrs update-alternatives"

inherit rpm
