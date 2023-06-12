SUMMARY = "An SVG scrubber"
DESCRIPTION = "Scour is a Python script that aggressively cleans SVG files, removing \
a lot of 'cruft' that certain tools or authors embed into their \
documents. \
The goal of scour is to provide an identically rendered image."
LICENSE = "Apache-2.0"

PV = "0.38.2"

RPM_NAME = "python39-scour-0.38.2-1.11.noarch.rpm"
RPM_HASH = "16505e40f4731033f0ddd72671b3f31e6f635b86af89b70a1a5a9be637c8c5b9580563c3ed68212c72d542aeebf53ec15a630db17c6d59d7eada1c5153b56121"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(scour) \
python39-scour \
python3dist(scour) \
scour"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-setuptools \
python39-six \
update-alternatives"

inherit rpm
