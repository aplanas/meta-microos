SUMMARY = "Python Module for Accessing and Modifying Configuration Data in INI files"
DESCRIPTION = "iniparse is an INI parser for Python which is API compatible with the \
standard library's ConfigParser, preserves structure of INI files \
(order of sections & options, indentation, comments, and blank lines \
are preserved when data is updated), and is more convenient to use."
LICENSE = "MIT"

PV = "0.5"

RPM_NAME = "python311-iniparse-0.5-4.3.noarch.rpm"
RPM_HASH = "fb34b4c5cb12a46b6c270753feb3bc53b8a34a2f5b97a36ea9ea8d43cd7809957e302e4b1172450764f8d8618cd6429aababd04a91f9cf024a317daeb899dce1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(iniparse) \
python311-iniparse \
python3dist(iniparse)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
