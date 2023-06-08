SUMMARY = "Python IMAP for Human beings"
DESCRIPTION = "Python library for reading IMAP mailboxes and converting email content to machine readable data"
LICENSE = "MIT"

PV = "0.9.8"

RPM_NAME = "python311-imbox-0.9.8-1.12.aarch64.rpm"
RPM_HASH = "af248c97e3856e93382132e6d92a8aff7083c62e5def425369d69b82354e413cb5b3d7b6d18f32cef35563970bbfe6a33442552e4d80539ace9223a08fd9ea6f"

RPROVIDES:${PN} += "python3.11dist(imbox) python311-imbox python311-imbox(aarch-64) python3dist(imbox)"
RDEPENDS:${PN} += "python(abi) python311-chardet"

inherit rpm
