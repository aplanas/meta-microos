SUMMARY = "Redmine plugin for md2workflow"
DESCRIPTION = "Redmine plugin for md2workflow"
LICENSE = "GPL-3.0-only"

PV = "1.4.18"

RPM_NAME = "python39-md2workflow-plugins-redmine-1.4.18-4.11.noarch.rpm"
RPM_HASH = "13bd5bf1933101edeb526ebccfb8018f96733d16432396c98145dcf95f592fdfc19f85bbf6209caa168aa28a05e4bf7b8762450e4c98d78843a43d578efd2518"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-md2workflow-plugins-redmine"
RDEPENDS:${PN} += "python(abi) python39-md2workflow python39-python-redmine"

inherit rpm
