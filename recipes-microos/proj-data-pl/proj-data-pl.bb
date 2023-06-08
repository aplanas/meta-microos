SUMMARY = "Poland datum grids for Proj"
DESCRIPTION = "Poland datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.2.0"

RPM_NAME = "proj-data-pl-9.2.0-1.3.noarch.rpm"
RPM_HASH = "9c1a84ae3aac3d3d4b779bd1f54aeddcc55b246d9d9650f39c450212ae24d38a6f78100a02561f2a9d49f11db4b1409ea71aecf9f9047376f548dd61bd87ec6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-pl"
RDEPENDS:${PN} += ""

inherit rpm
