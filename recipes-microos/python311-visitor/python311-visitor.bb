SUMMARY = "A tiny pythonic visitor implementation"
DESCRIPTION = "A tiny library to facilitate visitor implementation in Python \
(which are slightly peculiar due to dynamic typing)."
LICENSE = "MIT"

PV = "0.1.3"

RPM_NAME = "python311-visitor-0.1.3-1.18.noarch.rpm"
RPM_HASH = "ea77e377ffabbf609f84a2ff0071851d9cbec22e9f4ca80f7607644e01747119f332aefde8f7e6aacd31a7fc820bd999abf4d789195c29ca1bc151a44db1f63c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(visitor) \
python311-visitor \
python3dist(visitor)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
