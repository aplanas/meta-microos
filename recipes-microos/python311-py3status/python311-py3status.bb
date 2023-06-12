SUMMARY = "Python extensible i3status wrapper"
DESCRIPTION = "py3status is an extensible i3status wrapper written in python. \
 \
Using py3status, you can take control of your i3bar easily by: \
 \
- using one of the availables modules shipped with py3status \
- writing your own modules and have their output displayed on your bar \
- handling click events on your i3bar and play with them in no time \
- seeing your clock tick every second whatever your i3status interval \
 \
py3status has a standalone mode allowing to bypass i3status when you need \
a py3status-modules-only i3bar."
LICENSE = "BSD-3-Clause"

PV = "3.50"

RPM_NAME = "python311-py3status-3.50-1.1.noarch.rpm"
RPM_HASH = "03ac1b1b91e04cfbc48a64b132f5f1d00ac4789ff19e502879c61958aa1d4a03f3835e6d6aafaedd599f6b123a8d364f85fc68f927757805aa893606f47cd706"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "py3status \
python3.11dist(py3status) \
python311-py3status \
python3dist(py3status)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-setuptools \
update-alternatives"

inherit rpm
