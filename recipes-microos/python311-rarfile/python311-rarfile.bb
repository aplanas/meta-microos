SUMMARY = "RAR Archive Reader for Python"
DESCRIPTION = "This is a Python module for RAR archive reading. It supports both RAR \
2.x and 3.x archives, multi volume archives, Unicode filenames, \
password-protected archives, archive and file comments. The archive \
parsing and non-compressed files are handled in pure Python code, for \
compressed files, the 'unrar' utility is run."
LICENSE = "ISC"

PV = "4.0"

RPM_NAME = "python311-rarfile-4.0-3.5.noarch.rpm"
RPM_HASH = "1f8f8266321287ec932a53351da34a9699814d16c0bb2d8603b8b7911522bf57ee4312f33c4f13a0cee3e6a24e63776cc69999f8edc017da4861f2b59d1eae3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(rarfile) \
python311-rarfile \
python3dist(rarfile)"
RDEPENDS:${PN} += "bsdtar \
python(abi)"

inherit rpm
