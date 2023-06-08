SUMMARY = "SMBv2/v3 client for Python 2 and 3"
DESCRIPTION = "This library implements the SMBv2 and SMBv3 protocol. \
 \
Features \
-------- \
-  Negotiation of the SMB 2.0.2 protocol to SMB 3.1.1 (Windows 10/Server \
   2016) \
-  Authentication with both NTLM and Kerberos \
-  Message signing \
-  Message encryption (SMB 3.x.x+) \
-  Connect to a Tree/Share \
-  Opening of files, pipes and directories \
-  Set create contexts when opening files \
-  Read and writing of files and pipes \
-  Sending IOCTL commands \
-  Sending of multiple messages in one packet (compounding)"
LICENSE = "MIT"

PV = "1.10.1"

RPM_NAME = "python311-smbprotocol-1.10.1-1.3.noarch.rpm"
RPM_HASH = "1a209abe6fd86148590715a9bc26c35a3c7190259da11d271532b5ef26ffc69742cd8b7d53a7e1bd30fbb1b39470c1c3408384986524e3ebfc8c064090344170"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(smbprotocol) python311-smbprotocol python3dist(smbprotocol)"
RDEPENDS:${PN} += "python(abi) python311-cryptography python311-pyspnego"

inherit rpm
