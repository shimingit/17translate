/*
 * SimpleModal Confirm Modal Dialog
 * http://www.ericmmartin.com/projects/simplemodal/
 * http://code.google.com/p/simplemodal/
 * Download by http://www.jb51.net
 * Copyright (c) 2009 Eric Martin - http://ericmmartin.com
 *
 * Licensed under the MIT license:
 *   http://www.opensource.org/licenses/mit-license.php
 *
 * Revision: $Id: confirm.js 185 2009-02-09 21:51:12Z emartin24 $
 *
 */

$(document).ready(function () {
	$('#submitnews').click(function (e) {
		e.preventDefault();
		alert("");
		// example of calling the confirm function
		// you must use a callback function to perform the "yes" action
		confirm("<span style='font-weight:bold'>\u786e\u5b9a\u63d0\u4ea4\u60a8\u7684\u4f5c\u54c1\u5417\uff1f</span>", function () {
			  $("form[name='submitnews']")[0].submit();
		});
	});
});

function confirm(message, callback) {
	$('#confirm').modal({
		close:false,
		position: ["30%",],
		overlayId:'confirmModalOverlay',
		containerId:'confirmModalContainer', 
		onShow: function (dialog) {
			dialog.data.find('.message').append(message);

			// if the user clicks "yes"
			dialog.data.find('.yes').click(function () {
				// call the callback
				if ($.isFunction(callback)) {
					callback.apply();
				}
				// close the dialog
				$.modal.close();
			});
		}
	});
}
