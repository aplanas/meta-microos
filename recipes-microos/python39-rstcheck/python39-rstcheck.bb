SUMMARY = "Python module to check syntax of reStructuredText"
DESCRIPTION = "A Python module to check the syntax of reStructuredText and code \
blocks nested within it."
LICENSE = "MIT"

PV = "3.3.1"

RPM_NAME = "python39-rstcheck-3.3.1-5.11.noarch.rpm"
RPM_HASH = "874f3c04015068d5e9a2a230f9022d5f0683835e1ee0228f3ce0a1b65dbcaef37d0a8ebf2f9d412e172f9fd5c5881f6de5a3c9df4b88f7d87243c66e702eac8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(rstcheck) \
python39-rstcheck \
python3dist(rstcheck) \
rstcheck"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-docutils \
update-alternatives"

inherit rpm
