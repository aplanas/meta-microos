SUMMARY = "Traits-capable windowing framework"
DESCRIPTION = "The TraitsGUI project contains a toolkit-independent GUI abstraction layer \
(known as Pyface), which is used to support the 'visualization' features of \
the Traits package. Thus, you can write code in terms of the Traits API \
(views, items, editors, etc.), and let TraitsGUI and your selected toolkit \
and back-end take care of the details of displaying them. \
 \
Part of the Enthought Tool Suite (ETS)."
LICENSE = "BSD-3-Clause & EPL-1.0 & LGPL-2.1-only & LGPL-3.0-only"

PV = "7.2.1"

RPM_NAME = "python39-traitsui-7.2.1-1.6.noarch.rpm"
RPM_HASH = "c41deb1d1bb74e89c0acf3868b0fd6415703f109b02246178152c815eb6529b7055b2cec17bcf3a61603e0c4f933f19a64662caa8d288659e4ab65ead8b7c9fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(traitsui) python39-traitsui python3dist(traitsui)"
RDEPENDS:${PN} += "python(abi) python39-pyface python39-traits"

inherit rpm
