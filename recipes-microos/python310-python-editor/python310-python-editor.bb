SUMMARY = "Python library to programmatically open an editor and capture the result"
DESCRIPTION = "python-editor is a library that provides the editor module for \
programmatically interfacing with the editor defined in the EDITOR \
environment variable."
LICENSE = "Apache-2.0"

PV = "1.0.4"

RPM_NAME = "python310-python-editor-1.0.4-1.14.noarch.rpm"
RPM_HASH = "10466b66196baa845919b45138fd65015eed432f417bae2abaadde34c05e89b53a1c26fd3280716982de7eedb2a14b19e121edc95bfbb3eba987c721a9cdcbab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-editor python3.10dist(python-editor) python310-python-editor python3dist(python-editor)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
