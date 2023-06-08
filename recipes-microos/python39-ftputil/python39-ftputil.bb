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

RPM_NAME = "python39-ftputil-3.4-3.15.noarch.rpm"
RPM_HASH = "40a491656e4322d0fbaa54536aaa9a48e3270bef82a5c688192ef5feae1bfc9c2a54885d5a4cf3b7c3e0f0f602a2a5e6d9905ac1bed69463fb9de9fb14a3bb72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(ftputil) python39-ftputil python3dist(ftputil)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
