SUMMARY = "Thin wrapper for pandoc"
DESCRIPTION = "pypandoc provides a thin wrapper for pandoc, a universal document converter."
LICENSE = "MIT"

PV = "1.6.4"

RPM_NAME = "python310-pypandoc-1.6.4-3.5.aarch64.rpm"
RPM_HASH = "3f310975aed840289f2aa4a03faaff9e0d1c9c126ba6ba2dee7e7d0af03e71eb3122bd49309d0097908d0b26b61fa65036e302721a4e23e8e86ab5aa47fbbb6f"

RPROVIDES:${PN} += "python3-pypandoc python3.10dist(pypandoc) python310-pypandoc python310-pypandoc(aarch-64) python3dist(pypandoc)"
RDEPENDS:${PN} += "pandoc python(abi) python310-pip python310-wheel"

inherit rpm
