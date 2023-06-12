SUMMARY = "WebDAV library for Python - GNU Health port"
DESCRIPTION = "This is a Python WebDAV implementation (level 1 and 2) that \
features a library for integrating WebDAV server capabilities \
into applications. \
 \
An example on how to use the library is included. This server \
can be run as daemon. \
 \
Port from Andrew Leech PyWebDAV3 library to Support GNU Health."
LICENSE = "GPL-3.0-or-later"

PV = "0.10.3"

RPM_NAME = "python311-PyWebDAV3-GNUHealth-0.10.3-1.17.noarch.rpm"
RPM_HASH = "6f5ffc5ec19a26366cf38a640512753491af1f9cdcaa0cc0d40fddb7d5683619caface6c07f94d4e580b41e1ba53b91ac95269a0a4771935351a8b31abb3352f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pywebdav3-gnuhealth) \
python311-PyWebDAV3-GNUHealth \
python3dist(pywebdav3-gnuhealth)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
update-alternatives"

inherit rpm
