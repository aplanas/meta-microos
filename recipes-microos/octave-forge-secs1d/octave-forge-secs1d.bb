SUMMARY = "SEmi Conductor Simulator in 1D for Octave"
DESCRIPTION = "A Drift-Diffusion simulator for 1d semiconductor devices. \
This is part of the Octave-Forge project."
LICENSE = "GPL-2.0+ & GPL-3.0+"

PV = "0.0.9"

RPM_NAME = "octave-forge-secs1d-0.0.9-1.20.noarch.rpm"
RPM_HASH = "b0d119e167e21328c2b58c90826f7d0d3cc95c4bdafeae218bd61d92d0b4414cd1551028f6c4110fe958eae0eb136c39aa1a0871d07b26838a4d8186e091a928"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "octave-forge-secs1d"
RDEPENDS:${PN} += "/bin/sh octave-cli octave-forge-bim"

inherit rpm
