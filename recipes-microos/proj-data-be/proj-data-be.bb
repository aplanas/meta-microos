SUMMARY = "Belgium datum grids for Proj"
DESCRIPTION = "Belgium datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.2.0"

RPM_NAME = "proj-data-be-9.2.0-1.3.noarch.rpm"
RPM_HASH = "19bd63bf41096fe2e4cceac566481575f8aafaba101942449b1b9deabeac3fe7a439846973cc63fef2bd08b620e913b758f51b4e8c562ee5938fdce5d5b695df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-be"
RDEPENDS:${PN} += ""

inherit rpm
