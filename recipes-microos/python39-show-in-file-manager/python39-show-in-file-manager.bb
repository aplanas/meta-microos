SUMMARY = "Open the system file manager and select files in it"
DESCRIPTION = "Show in File Manager is a Python package to open the system file manager \
and optionally select files in it. The point is not to open the files, but \
to select them in the file manager, thereby highlighting the files and allowing \
the user to quickly do something with them."
LICENSE = "MIT"

PV = "1.1.4"

RPM_NAME = "python39-show-in-file-manager-1.1.4-1.11.noarch.rpm"
RPM_HASH = "05fb2044fbb7b25f3b1f03bed608d7b2b516b046ed1389be5da5f35444c7b4e60781ae6fde96cf1c1760dc20d969fb6483934b96b5fe1da51a357cf7731237d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(show-in-file-manager) \
python39-show-in-file-manager \
python3dist(show-in-file-manager)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-packaging \
python39-pyxdg \
update-alternatives"

inherit rpm
