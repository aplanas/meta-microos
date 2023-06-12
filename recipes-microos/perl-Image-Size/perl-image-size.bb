SUMMARY = "Read the dimensions of an image in several popular formats"
DESCRIPTION = "The *Image::Size* library is based upon the 'wwwis' script written by Alex \
Knowles _(alex@ed.ac.uk)_, a tool to examine HTML and add 'width' and \
'height' parameters to image tags. The sizes are cached internally based on \
file name, so multiple calls on the same file name (such as images used in \
bulleted lists, for example) do not result in repeated computations."
LICENSE = "LGPL-2.1-only | Artistic-1.0"

PV = "3.300"

RPM_NAME = "perl-Image-Size-3.300-3.10.noarch.rpm"
RPM_HASH = "16894a68efb32ba797aadf87fef1d1e8c94e85f1ab4a637f7c522a7641765c046aec521148759dc6fe48aee19e6b2209204c0170f5a862373fc16fa44988726a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Image::Size) \
perl-Image-Size"
RDEPENDS:${PN} += "/usr/bin/env \
perl(:MODULE_COMPAT_5.36.0) \
perl(Module::Build) \
perl(Test::More)"

inherit rpm
