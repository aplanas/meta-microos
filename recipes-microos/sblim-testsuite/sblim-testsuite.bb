SUMMARY = "SBLIM Testsuite"
DESCRIPTION = "Standards Based Linux Instrumentation Base Providers Test Suite \
 \
 \
 \
Authors: \
-------- \
    SBLIM Project"
LICENSE = "EPL-1.0"

PV = "1.3.0"

RPM_NAME = "sblim-testsuite-1.3.0-6.15.noarch.rpm"
RPM_HASH = "66641d03522ebb7ba5b67278ea55e2897ccc063636351b920d8f3ed567377a8c40a40eec504b02132437acd0114f43ada95214200889473445473fcfd024c790"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(associator) perl(cimom) perl(consistence) perl(instance) sblim-testsuite"
RDEPENDS:${PN} += "/bin/sh /usr/bin/perl sblim-wbemcli"

inherit rpm
