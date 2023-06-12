SUMMARY = "SSH tunnels to remote server"
DESCRIPTION = "The sshtunnel package allows one to create SSH tunnels using local \
or remote port forwarding. Thus, it provides a Python wrapper to \
the same functionality provided by the SSH command using the -L \
and -R parameters."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python39-sshtunnel-0.4.0-2.6.noarch.rpm"
RPM_HASH = "820bc1b37131194a3fe7779e6e7bcc8b4ade6700f091f37b52d6fa1bdf9557b8a4567ddef32ed667f02c590294bdfb9b6b186bd053ea051f3871210641e92f26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(sshtunnel) \
python39-sshtunnel \
python3dist(sshtunnel)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
openssh \
python(abi) \
python39-paramiko"

inherit rpm
