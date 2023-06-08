SUMMARY = "Library that versions your Python projects"
DESCRIPTION = "Incremental is a small library that versions your Python projects."
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python311-incremental-22.10.0-2.1.noarch.rpm"
RPM_HASH = "70e2ab537cb511607c258cf0a4bf309d40dd83660f0dda5335e2ae227d74362a88210ce6e1279674af2b9de5cadeb3cff5fa37fda585be71e410a6146fcadea9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(incremental) python311-incremental python3dist(incremental)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
