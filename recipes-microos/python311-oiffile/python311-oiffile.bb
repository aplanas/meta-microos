SUMMARY = "Read Olympus(r) image files (OIF and OIB)"
DESCRIPTION = "Oiffile is a Python library to read image and metadata from Olympus Image \
Format files. OIF is the native file format of the Olympus FluoView(tm) \
software for confocal microscopy."
LICENSE = "BSD-3-Clause"

PV = "2022.9.29"

RPM_NAME = "python311-oiffile-2022.9.29-1.3.noarch.rpm"
RPM_HASH = "3c3854ba5e5d3617d4cc7623db0146de8c3f476d02bbdb08cffe1e0373dc2bd468c7bcd5aa88e1b9656ccf7ebe8406b8940f9c68dafd338655dec50c855b91e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(oiffile) \
python311-oiffile \
python3dist(oiffile)"
RDEPENDS:${PN} += "python(abi) \
python311-numpy \
python311-tifffile"

inherit rpm
