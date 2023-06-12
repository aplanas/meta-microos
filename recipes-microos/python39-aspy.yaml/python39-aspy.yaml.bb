SUMMARY = "A few extensions to pyyaml"
DESCRIPTION = "A few extensions to pyyaml."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python39-aspy.yaml-1.3.0-2.8.noarch.rpm"
RPM_HASH = "a3bea50c0134de60c7409163094c81c24470f1658ed37cf2feda43cf036fdca67e55097cc97b724f51efe093dad27b54d36976e803a49ae9114d33c1aac70f06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(aspy.yaml) \
python39-aspy.yaml \
python3dist(aspy.yaml)"
RDEPENDS:${PN} += "python(abi) \
python39-PyYAML"

inherit rpm
