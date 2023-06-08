SUMMARY = "Python module for ANSI color output and colored highlighting and diffing"
DESCRIPTION = "Ansicolor is a library that offers ANSI color markup for \
command line programs."
LICENSE = "Apache-2.0"

PV = "0.3.2"

RPM_NAME = "python311-ansicolor-0.3.2-1.6.noarch.rpm"
RPM_HASH = "5f27824b1cbcd25e496aa2d6b4c13d38e77eb2c82a30c6c4115215cbf1a44a8d4f0eb19806f72823ba39f315a7e970da1d8578537f842e6e5b19dae88143bf2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(ansicolor) python311-ansicolor python3dist(ansicolor)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
