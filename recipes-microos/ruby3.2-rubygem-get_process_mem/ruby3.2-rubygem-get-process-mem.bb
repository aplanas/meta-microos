SUMMARY = "Use GetProcessMem to find out the amount of RAM used by any process"
DESCRIPTION = "Get memory usage of a process in Ruby ."
LICENSE = "MIT"

PV = "0.2.7"

RPM_NAME = "ruby3.2-rubygem-get_process_mem-0.2.7-1.15.aarch64.rpm"
RPM_HASH = "8f2d5965d1819d429d84a8f10a06444eee3b779e355b15ca64729e415b7bd32c972474f6d4b9a62a647da1172f7a948c6756153a950e0ed65e666162f05a3a75"

RPROVIDES:${PN} += "ruby3.2-rubygem-get_process_mem ruby3.2-rubygem-get_process_mem(aarch-64) rubygem(get_process_mem) rubygem(ruby:3.2.0:get_process_mem) rubygem(ruby:3.2.0:get_process_mem:0) rubygem(ruby:3.2.0:get_process_mem:0.2) rubygem(ruby:3.2.0:get_process_mem:0.2.7)"
RDEPENDS:${PN} += "ruby(abi) rubygem(ruby:3.2.0:ffi:1)"

inherit rpm
