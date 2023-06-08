SUMMARY = "Mexico datum grids for Proj"
DESCRIPTION = "Mexico datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.2.0"

RPM_NAME = "proj-data-mx-9.2.0-1.3.noarch.rpm"
RPM_HASH = "2b8435b878761814606722990ce02642dd4c1115240a1acef60243864c1dbe0b1c941448ac3f8a1142379c372d7908551da07f1d62b43909f64b54aa6c20c1ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-mx"
RDEPENDS:${PN} += ""

inherit rpm
