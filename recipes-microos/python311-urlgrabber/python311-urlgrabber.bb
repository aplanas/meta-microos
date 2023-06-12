SUMMARY = "A high-level cross-protocol url-grabber"
DESCRIPTION = "A high-level cross-protocol url-grabber for python supporting HTTP, FTP \
and file locations.  Features include keepalive, byte ranges, \
throttling, authentication, proxies and more."
LICENSE = "LGPL-2.1-only"

PV = "4.1.0"

RPM_NAME = "python311-urlgrabber-4.1.0-8.2.noarch.rpm"
RPM_HASH = "bac3526092b9a8ae34d22949b4b52ec22813ca56f7566bb5b450d07f646bfb9a0fd4fb79b411ed3e09978c2d1e5c983b2af7c68c3db40e89b6b52de6a6f2582f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(urlgrabber) \
python311-urlgrabber \
python3dist(urlgrabber)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-pycurl \
update-alternatives"

inherit rpm
