SUMMARY = "Tool to make ternary plots in python"
DESCRIPTION = "This is a plotting library for use with matplotlib to make ternary plots plots \
in the two dimensional simplex projected onto a two dimensional plane. \
 \
The library provides functions for plotting projected lines, curves \
(trajectories), scatter plots, and heatmaps."
LICENSE = "MIT"

PV = "1.0.8"

RPM_NAME = "python311-python-ternary-1.0.8-1.7.noarch.rpm"
RPM_HASH = "6053a5f905c53f2d091c27ca690c62d11c5fceada4ec3c10cecc673b34b64a01b8a3812edf1f3771b0cf93389436938266612a89d76867e203e162d63c63280a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(python-ternary) python311-python-ternary python3dist(python-ternary)"
RDEPENDS:${PN} += "python(abi) python311-matplotlib"

inherit rpm
