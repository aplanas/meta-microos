SUMMARY = "Prawn::Templates allows using PDFs as templates in Prawn"
DESCRIPTION = "A extention to prawn that allows to include other pdfs either as background to \
write upon or to combine several pdf documents into one."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "0.1.2"

RPM_NAME = "ruby3.2-rubygem-prawn-templates-0.1.2-1.12.aarch64.rpm"
RPM_HASH = "c27512f868e3aa49ba322a6da377d078a30c48cf89eb9b9e38859a3828d955850bf3018d2911e49c4061621a76d6932300e9aab67f30b75e13616531d012daf1"

RPROVIDES:${PN} += "ruby3.2-rubygem-prawn-templates ruby3.2-rubygem-prawn-templates(aarch-64) rubygem(prawn-templates) rubygem(ruby:3.2.0:prawn-templates) rubygem(ruby:3.2.0:prawn-templates:0) rubygem(ruby:3.2.0:prawn-templates:0.1) rubygem(ruby:3.2.0:prawn-templates:0.1.2)"
RDEPENDS:${PN} += "ruby(abi) rubygem(ruby:3.2.0:pdf-reader:2) rubygem(ruby:3.2.0:prawn:2)"

inherit rpm
