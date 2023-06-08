SUMMARY = "A set of Tkinter widgets to display readonly text and code"
DESCRIPTION = "A set of Tkinter widgets to display readonly text and code."
LICENSE = "BSD-3-Clause"

PV = "0.6.1"

RPM_NAME = "python310-tkreadonly-0.6.1-2.11.noarch.rpm"
RPM_HASH = "3cf7a5a1ae59b70a658c70f106179ffe6fe83c9ffb4bd2312923d30aee9c013bd7145fa3df7e940a393a13ecfa4283c56fa21a4bfdee3a0ae7205b4cd7ab5c73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tkreadonly python3.10dist(tkreadonly) python310-tkreadonly python3dist(tkreadonly)"
RDEPENDS:${PN} += "python(abi) python310-Pygments python310-idle python310-tk"

inherit rpm
