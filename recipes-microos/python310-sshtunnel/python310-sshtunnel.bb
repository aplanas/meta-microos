SUMMARY = "SSH tunnels to remote server"
DESCRIPTION = "The sshtunnel package allows one to create SSH tunnels using local \
or remote port forwarding. Thus, it provides a Python wrapper to \
the same functionality provided by the SSH command using the -L \
and -R parameters."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python310-sshtunnel-0.4.0-2.6.noarch.rpm"
RPM_HASH = "4333cc4794f4ade6e3a82b21a86d2050538d7a6e74cb4c507e3d6b5a99e8dd6f219ba9de5bc7202d5075df772302f0deaff2629c51ac4be73fe26404d066b172"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sshtunnel \
python3.10dist(sshtunnel) \
python310-sshtunnel \
python3dist(sshtunnel)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
openssh \
python(abi) \
python310-paramiko"

inherit rpm
