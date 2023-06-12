SUMMARY = "A CI service for pagure"
DESCRIPTION = "Pagure comes with a continuous integration service, currently supporting \
only jenkins but extendable to others. \
With this service, your CI server will be able to report the results of the \
build on the pull-requests opened to your project."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.13.3"

RPM_NAME = "pagure-ci-5.13.3-1.4.noarch.rpm"
RPM_HASH = "bbfa71a5f6aa9213ec1e2edbd4790b06b1cceab0833b5b6e165a5af5bcf3d6642dd9194c31ba131e009856acc1c6bf64e8ae54bcc17e18bde71f5b9c563912b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pagure-ci"
RDEPENDS:${PN} += "/bin/sh \
pagure \
python3-python-jenkins \
systemd"

inherit rpm
