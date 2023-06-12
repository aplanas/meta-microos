SUMMARY = "Client-side Sieve and Managesieve library written in Python"
DESCRIPTION = "Client-side Sieve and Managesieve library written in Python. \
* Sieve: An Email Filtering Language (RFC 5228) \
* ManageSieve: A Protocol for Remotely Managing Sieve Scripts (RFC 5804)"
LICENSE = "MIT"

PV = "1.2.1"

RPM_NAME = "python39-sievelib-1.2.1-1.13.noarch.rpm"
RPM_HASH = "7ba5794eecbe82caed4168b670ff0eb40b3d977d2bf9c953a1a3286a2c6a5d48696c2a6749d696793178dde42f57759af2478c61754228f9c0f48441dcacbd6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(sievelib) \
python39-sievelib \
python3dist(sievelib)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
