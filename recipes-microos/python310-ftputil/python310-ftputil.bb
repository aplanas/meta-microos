SUMMARY = "High-level FTP client library (virtual file system and more) for Python"
DESCRIPTION = "FTPutil is a high-level FTP client library for the Python programming \
language. ftputil implements a virtual file system for accessing FTP \
servers, that is, it can generate file-like objects for remote files. \
The library supports many functions similar to those in the os, \
os.path and shutil modules. ftputil has convenience functions for \
conditional uploads and downloads, and handles FTP clients and \
servers in different timezones."
LICENSE = "BSD-3-Clause"

PV = "3.4"

RPM_NAME = "python310-ftputil-3.4-3.15.noarch.rpm"
RPM_HASH = "09d267c9d449f48c13bd1c111bf56f78ca7607e483906b0fffc2d943a0da418b7635ddfabcc676420b9971de8f3ab0ad3c45c812db07399d41cbe88fdf8c088c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ftputil python3.10dist(ftputil) python310-ftputil python3dist(ftputil)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
