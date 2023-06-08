SUMMARY = "Catkin package library"
DESCRIPTION = "Library for retrieving information about catkin packages."
LICENSE = "BSD-3-Clause"

PV = "0.4.24"

RPM_NAME = "python310-catkin-pkg-0.4.24-2.9.noarch.rpm"
RPM_HASH = "eb80223eba22e00dcec3edef36470356129ac6ec825e3ad44be33aa782183bd425199255485c8fe1b76b0bea5942eebdeda5e335be833422ddbf8dc8fb470adf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-catkin-pkg python3.10dist(catkin-pkg) python310-catkin-pkg python3dist(catkin-pkg)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-docutils python310-pyparsing python310-python-dateutil python310-setuptools update-alternatives"

inherit rpm
