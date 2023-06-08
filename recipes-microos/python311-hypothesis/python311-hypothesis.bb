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

RPM_NAME = "python311-hypothesis-6.61.2-3.1.noarch.rpm"
RPM_HASH = "0c09597b9df2e7d5fe84f5b2a9aed861f14ada0d5869085a2fd2efc0dd0480e12a3736a4d84054099fd3a7583930f81c15a7a3aa7910f5995a246faee40f3c19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(hypothesis) python311-hypothesis python3dist(hypothesis)"
RDEPENDS:${PN} += "(python311-exceptiongroup >= 1.0.0 if python311-base < 3.11) (python311-sortedcontainers >= 2.1.0 with python311-sortedcontainers < 3.0) /bin/sh /usr/bin/python3.11 python(abi) python311-attrs update-alternatives"

inherit rpm
