SUMMARY = "Android APK packager for Python scripts and apps"
DESCRIPTION = "Android APK packager for Python scripts and apps"
LICENSE = "MIT"

PV = "2022.9.4"

RPM_NAME = "python39-python-for-android-2022.9.4-2.4.noarch.rpm"
RPM_HASH = "c8ed2b2a446875c716d47329c2c8ae8f32bc8a479d6167016ac7f22cbddce040054680f524d42181e655dcefdf5bb1b3b443bcaee534ceb227e489f33274909e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(python-for-android) python39-python-for-android python3dist(python-for-android)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/bash /usr/bin/python3.9 python(abi) python39-Jinja2 python39-appdirs python39-colorama python39-pep517 python39-toml update-alternatives"

inherit rpm
