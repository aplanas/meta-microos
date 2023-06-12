SUMMARY = "Python library for doing colorspace conversions"
DESCRIPTION = "Colorspacious is a library for performing colorspace conversions. \
 \
In addition to the most common standard colorspaces (sRGB, XYZ, xyY, \
CIELab, CIELCh), it also includes color vision deficiency ('color \
blindness') simulations using the approach of Machado et al (2009), a \
complete implementation of CIECAM02 \
<https://en.wikipedia.org/wiki/CIECAM02>, and the perceptually \
uniform CAM02-UCS / CAM02-LCD / CAM02-SCD spaces proposed by Luo et al \
(2006)."
LICENSE = "MIT"

PV = "1.1.2"

RPM_NAME = "python39-colorspacious-1.1.2-2.7.noarch.rpm"
RPM_HASH = "068b98e6f7d707537c6c8f63b6f1951604bcb2d619077eea3c2c34299beed73a1dfaa7684b456994d92628b75bb6b39de8dbe174cf93581ddf3d0b63705e88d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(colorspacious) \
python39-colorspacious \
python3dist(colorspacious)"
RDEPENDS:${PN} += "python(abi) \
python39-numpy"

inherit rpm
