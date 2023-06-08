SUMMARY = "Documentation for GTKWave"
DESCRIPTION = "GTKWave is a waveform viewer that can view VCD files produced by most Verilog \
simulation tools, as well as LXT files produced by certain Verilog simulation \
tools. \
 \
This package contains documentation for GTKWave"
LICENSE = "GPL-2.0-or-later"

PV = "3.3.114"

RPM_NAME = "gtkwave-doc-3.3.114-1.3.noarch.rpm"
RPM_HASH = "e7a136bbaa5cf6f1d7872be2ac326e99342c33d71bfe02a4d25a80af4c6bac0b2ed18e94736f5c1f3d1519deee3795592d77ec2842390a4a2789d50eb781fc22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtkwave-doc"
RDEPENDS:${PN} += "gtkwave"

inherit rpm
