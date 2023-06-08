SUMMARY = "xSGE Tiled Library"
DESCRIPTION = "xSGE is a collection of extensions for the SGE licensed under the GNU \
General Public License.  They are designed to give additional features \
to free/libre software games which aren't necessary, but are nice to \
have. \
 \
xSGE extensions are not dependent on any particular SGE implementation. \
They should work with any implementation that follows the specification. \
 \
This extension provides support for loading the JSON format of the \
Tiled Map Editor. This allows you to use Tiled to edit your game’s world \
(e.g. levels), rather than building a level editor yourself."
LICENSE = "GPL-3.0-or-later"

PV = "2.0"

RPM_NAME = "python311-xsge_tiled-2.0-1.3.noarch.rpm"
RPM_HASH = "694a45db054814f798cd544f4354340aed283f5ce1b434241aea9eb6b93edccbdcf393edbd74ad69e0b40ea46c57af4c24487bf4de01783c15131e4badb838a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(xsge-tiled) python311-xsge_tiled python3dist(xsge-tiled)"
RDEPENDS:${PN} += "python(abi) python311-sge-pygame python311-xsge_path"

inherit rpm
