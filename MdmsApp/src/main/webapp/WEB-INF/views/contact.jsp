<%@include file="../partials/taglibs.jspf" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<%@include file="../partials/metas.jspf" %>
	<%@include file="../partials/outputCss.jspf" %>
	<title>Contact Tab</title>
</head>
<body class="animated-content infobar-overlay">
	<%@include file="../partials/header.jspf" %>
	
	<div id="wrapper">
		<div id="layout-static">
	               <div class="static-sidebar-wrapper sidebar-bleachedcedar">
	                   <div class="static-sidebar">
	                       <div class="sidebar">
	<div class="widget" id="widget-profileinfo">
	       <div class="widget-body">
	           <div class="userinfo ">
	               <div class="avatar pull-left">
	                   <img src="assets/demo/avatar/avatar_15.png" class="img-responsive img-circle"> 
	               </div>
	               <div class="info">
	                   <span class="username">Jonathan Smith</span>
	                   <span class="useremail">jon@paperadmin.com</span>
	               </div>
	
	               <div class="acct-dropdown clearfix dropdown">
	                   <span class="pull-left"><span class="online-status online"></span>Online</span>
	                   <!-- <span class="pull-right dropdown-toggle" data-toggle="dropdown"><a href="javascript:void(0)" class="btn btn-fab-caret btn-xs btn-fab"><i class="material-icons">arrow_drop_down</i><div class="ripple-container"></div></a></span>
	                   <ul class="dropdown-menu">
	                       <li><span class="online-status online"></span> Online</li>
	                       <li><span class="online-status online"></span> Online</li>
	                       <li><span class="online-status online"></span> Online</li>
	                       <li><span class="online-status online"></span> Online</li>
	                   </ul> -->
	                </div>
	            </div>
	        </div>
	    </div>
	
	   
		<div class="widget stay-on-collapse" id="widget-sidebar">
	        <nav role="navigation" class="widget-body">
		<ul class="acc-menu">
			<li class="nav-separator"><span>Navigation</span></li>
			<li><a  class="withripple" href="#!"><span class="icon">
			<i class="material-icons">home</i></span><span>Summary</span></a></li>
	
			<li><a  class="withripple" href="#!"><span class="icon">
			<i class="material-icons">email</i></span><span>Contact</span><span class="badge badge-teal">2</span></a></li>
	
			<li><a  class="withripple" href="#!"><span class="icon">
			<i class="material-icons">local_hospital</i></span><span>Mother Insurance</span></a></li>
	
			<li><a  class="withripple" href="#!"><span class="icon">
			<i class="material-icons">perm_contact_calendar</i></span><span>Referral Information</span></a></li>
	
			<li><a  class="withripple" href="#!"><span class="icon">
			<i class="material-icons">pregnant_woman</i></span><span>Pregnancy</span></a></li>
	
			<li><a  class="withripple" href="#!"><span class="icon">
			<i class="material-icons">face</i></span><span>Fetal Scheduling</span></a></li>
	
			<li><a  class="withripple" href="#!"><span class="icon">
			<i class="material-icons">card_travel</i></span><span>Fetal Visits</span></a></li>
	
			<li><a  class="withripple" href="#!"><span class="icon">
			<i class="material-icons">date_range</i></span><span>Delivery Plan</span></a></li>
	
			<li><a  class="withripple" href="#!"><span class="icon">
			<i class="material-icons">history</i></span><span>Records</span></a></li>
	
	
			<li><a  class="withripple" href="javascript:;"><span class="icon"><i class="material-icons">accessibility</i></span><span>Infant(s) Options</span></a>
				<ul class="acc-menu">
					<li><a  class="withripple" href="#!">Infant(s)</a></li>
					<li><a  class="withripple" href="#!">Infant(s) Insurance</a></li>
				</ul>
			</li>
		</ul>
	</nav>
	    </div>
	</div>
	                    </div>
	                </div>
	                <div class="static-content-wrapper">
	                    <div class="static-content">
	                        <div class="page-content">
	                            <ol class="breadcrumb">
	                                
	<li><a href="index.php">Home</a></li>
	
	                            </ol>
	                            <div class="page-heading">            
	                               
	                               <h1>Contact Tab</h1>
	                           </div>
	                            <div class="container-fluid">
	                                
	<div data-widget-group="group1">
		<div class="row">
			<div class="col-sm-12">
				<!-- <div class="alert alert-inverse">
				Use the <strong>same</strong> code as you would in <a class="alert-link" href="http://getbootstrap.com/">Twitter's Bootstrap</a>!
				<button type="button" class="close" data-dismiss="alert">&times;</button>
			</div> -->
			<div class="panel panel-primary" data-widget='{"draggable": "false"}'>
				<div class="panel-heading">
					<h2>CONTACT INFORMATION</h2>
					<!-- <div class="panel-ctrls" data-actions-container="" data-action-collapse='{"target": ".panel-body, .panel-footer"}'></div> -->
					<div class="options">
						<ul class="nav nav-tabs">
			              <li class="active"><a href="#horizontal-form" data-toggle="tab">Mother Information</a></li>
			              <li><a href="#bordered-row" data-toggle="tab">Father Information</a></li>
			              <li><a href="#tabular-form" data-toggle="tab">Other Contact</a></li>
			            </ul>
					</div>
				</div>
				<div class="panel-body">
					<app></app>
					</div>
					<!-- <div class="panel-footer">
						<div class="row">
							<div class="col-sm-8 col-sm-offset-2">
								<button class="btn-raised btn-primary btn">Submit</button>
								<button class="btn-default btn">Cancel</button>
							</div>
						</div>
					</div> -->
				</div>
			</div>
		</div>
	</div>
	
	                            </div> <!-- .container-fluid -->
	                       </div> <!-- #page-content -->
	                   </div>
	                   
	                   <%@include file="../partials/footer.jspf" %>
	                   
	               </div>
	               <div class="extrabar-underlay"></div>
	           </div>
	       </div>
	
	       <div class="infobar-wrapper scroll-pane">
	           <div class="infobar scroll-content">
	
	   
	       <!-- <ul class="nav nav-tabs material-nav-tabs stretch-tabs icon-tabs">
	           <li ><a href="#tab-7-2" data-toggle="tab">
	               <i class="material-icons">settings</i>
	           </a></li>
	       </ul> -->
	   
	
	   <div class="tab-content">
	       
	       <div class="tab-pane active" id="tab-7-2">
	
	           <div class="widget">
	               <!-- <div class="widget-heading"><i class="material-icons">settings</i>&nbsp;Toolbar</div> -->
	               <div class="widget-body">
	                   <ul class="timeline">
	                       <li class="timeline-purple">
	                           <div class="timeline-icon"><i class="material-icons">folder</i></div>
	                           <div class="timeline-body">
	                               <div class="timeline-header">
	                                   <a href=""><span class="author">Action #1</span></a>
	                               </div>
	                           </div>
	                       </li>
	                       <li class="timeline-primary">
	                           <div class="timeline-icon"><span style="font-size:11px;">M</span> <i class="material-icons" style="font-size:12px;margin-left:-5px;margin-top:-12px;">exposure_plus_1</i></div>
	                           <div class="timeline-body">
	                               <div class="timeline-header">
	                                   <a href=""><span class="author">Action #2</span></a>
	                               </div>
	                           </div>
	                       </li>
	                       <li class="timeline-green">
	                           <div class="timeline-icon"><span style="font-size:11px;">P</span> <i class="material-icons" style="font-size:12px;margin-left:-5px;margin-top:-12px;">exposure_plus_1</i></div>
	                            <div class="timeline-body">
	                                <div class="timeline-header">
	                                    <a href=""><span class="author">Action #3</span></a>
	                                </div>
	                            </div>
	                        </li>
	                        <li class="timeline-danger">
	                            <div class="timeline-icon"><i class="material-icons">cancel</i></div>
	                            <div class="timeline-body">
	                                <div class="timeline-header">
	                                    <a href=""><span class="author">Action #4</span></a>
	                                </div>
	                            </div>
	                        </li>
	                        <li class="timeline-sky">
	                            <div class="timeline-icon"><i class="material-icons">insert_drive_file</i></div>
	                            <div class="timeline-body">
	                                <div class="timeline-header">
	                                    <a href=""><span class="author">Action #5</span></a>
	                                </div>
	                            </div>
	                        </li>
	
	                        <li class="timeline-orange">
	                            <div class="timeline-icon"><i class="material-icons">picture_as_pdf</i></div>
	                            <div class="timeline-body">
	                                <div class="timeline-header">
	                                    <a href=""><span class="author">Action #6</span></a>
	                                </div>
	                            </div>
	                        </li>
	
	                        <li class="timeline-indigo">
	                            <div class="timeline-icon"><i class="material-icons">print</i></div>
	                            <div class="timeline-body">
	                                <div class="timeline-header">
	                                    <a href=""><span class="author">Action #7</span></a>
	                                </div>
	                            </div>
	                        </li>
	
	                        <li class="timeline-brown">
	                            <div class="timeline-icon"><i class="material-icons">insert_drive_file</i></div>
	                            <div class="timeline-body">
	                                <div class="timeline-header">
	                                    <a href=""><span class="author">Action #8</span></a>
	                                </div>
	                            </div>
	                        </li>
	                    </ul>
	                </div>
	            </div>
	
	
	            </div>
	        </div>
	
	    </div>
	
	</div>
	
	<%@include file="../partials/outputJs.jspf" %>
</body>
</html>