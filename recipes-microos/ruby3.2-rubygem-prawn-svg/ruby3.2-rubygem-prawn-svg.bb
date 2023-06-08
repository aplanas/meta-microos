SUMMARY = "SVG renderer for Prawn PDF library"
DESCRIPTION = "This gem allows you to render SVG directly into a PDF using the 'prawn' gem. \
Since PDF is vector-based, you'll get nice scaled graphics if you use SVG \
instead of an image."
LICENSE = "MIT"

PV = "0.32.0"

RPM_NAME = "ruby3.2-rubygem-prawn-svg-0.32.0-1.11.aarch64.rpm"
RPM_HASH = "75f931cc838a9596da0b7f80297ebe11a33c0fd3be55c9a01346426de3cbe89caf75adf081f04e6c38163074e49d3401a10d7bf0026df4cd5b27b74c37885e10"

RPROVIDES:${PN} += "ruby3.2-rubygem-prawn-svg ruby3.2-rubygem-prawn-svg(aarch-64) rubygem(prawn-svg) rubygem(ruby:3.2.0:prawn-svg) rubygem(ruby:3.2.0:prawn-svg:0) rubygem(ruby:3.2.0:prawn-svg:0.32) rubygem(ruby:3.2.0:prawn-svg:0.32.0)"
RDEPENDS:${PN} += "ruby(abi) rubygem(ruby:3.2.0:css_parser:1) rubygem(ruby:3.2.0:prawn) rubygem(ruby:3.2.0:rexml:3)"

inherit rpm
