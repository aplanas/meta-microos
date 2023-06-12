SUMMARY = "Python library to programmatically open an editor and capture the result"
DESCRIPTION = "python-editor is a library that provides the editor module for \
programmatically interfacing with the editor defined in the EDITOR \
environment variable."
LICENSE = "Apache-2.0"

PV = "1.0.4"

RPM_NAME = "python39-python-editor-1.0.4-1.14.noarch.rpm"
RPM_HASH = "71226ee28b5e6414db71a7ccd99176f972f4e0123f27c94f44cea131da235a20a02552574f7bc3690bae0019d8fa7eccef60b1706ccc2d608ad6ce7b1dcfe185"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(python-editor) \
python39-python-editor \
python3dist(python-editor)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
