SUMMARY = "SSH tunnels to remote server"
DESCRIPTION = "The sshtunnel package allows one to create SSH tunnels using local \
or remote port forwarding. Thus, it provides a Python wrapper to \
the same functionality provided by the SSH command using the -L \
and -R parameters."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python311-sshtunnel-0.4.0-2.6.noarch.rpm"
RPM_HASH = "8429e2085a4deb6c99cf622de8079211153daa19cb5aab40fbbf4eca81c0a40742068d23069cfd9073e87ba1b036fb2c968e4ae73ab639ed484da58060fe8857"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(sshtunnel) python311-sshtunnel python3dist(sshtunnel)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 openssh python(abi) python311-paramiko"

inherit rpm
