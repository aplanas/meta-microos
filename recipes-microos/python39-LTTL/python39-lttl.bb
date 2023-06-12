SUMMARY = "Library for text processing and analysis"
DESCRIPTION = "LangTech Text Library (LTTL) for text processing and analysis"
LICENSE = "GPL-3.0-only"

PV = "2.0.12"

RPM_NAME = "python39-LTTL-2.0.12-2.9.noarch.rpm"
RPM_HASH = "0b07aab2a22df5043f58ca1222e0a2960500feae0d146463c82496a813652f0239f9f94f5df672953fe9676d405c95ac37e2ca2a611058c1817e2c12e12abc13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(lttl) \
python39-LTTL \
python3dist(lttl)"
RDEPENDS:${PN} += "python(abi) \
python39-future \
python39-numpy \
python39-scipy"

inherit rpm
