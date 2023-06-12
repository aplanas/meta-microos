SUMMARY = "Python package for manipulating DXF drawings"
DESCRIPTION = "A Python package to create and modify DXF drawings, independent from the \
DXF version."
LICENSE = "MIT"

PV = "0.16.3"

RPM_NAME = "python39-ezdxf-0.16.3-1.10.aarch64.rpm"
RPM_HASH = "8cd68c7e16a68181f00518d75a62117c84f6f1d7f9895a3e98a3d379449aea0feb70541903bfb7d3dfbde7a507f4906406f64369780d22ce3d992a8f8957340f"

RPROVIDES:${PN} += "python3.9dist(ezdxf) \
python39-ezdxf \
python39-ezdxf(aarch-64) \
python3dist(ezdxf)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-pyparsing \
update-alternatives"

inherit rpm
