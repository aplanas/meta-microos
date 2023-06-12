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

RPM_NAME = "python311-colorspacious-1.1.2-2.7.noarch.rpm"
RPM_HASH = "e9413fab2b5035b7acfe0eb3bfe6584edb9e473dbff2a0e1b412ca2e0b7d9e548e84ff3714cfbc66bb7e44d42f40c6dec2a32e1323fc500ceab2a94741fb1899"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(colorspacious) \
python311-colorspacious \
python3dist(colorspacious)"
RDEPENDS:${PN} += "python(abi) \
python311-numpy"

inherit rpm
