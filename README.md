Repository contains ProgressBar similar to OnRefreshLayout.Multiple colorscheme can be added in progressbar.Elevation Effect occurs for Api>=21 and for devices with Api<21 there exist custom AppCombat View for which elevation effect can produced.This code contains MaterialProgressDrawable made from PullToRefresh Library.

Custom Scheme can be added to ProgressBar using below code:--

```
        circleImageView=new CircleImageView(getApplicationContext(),CIRCLE_BG_LIGHT,CIRCLE_DIAMETER/2);
        mProgress = new MaterialProgressDrawable(getApplicationContext(),circleImageView);
        mProgress.setBackgroundColor(CIRCLE_BG_LIGHT);
        mProgress.setProgressRotation(.7f);
        mProgress.setColorSchemeColors(....);
        mProgress.setAlpha(255);
        mProgress.showArrow(true);
        mProgress.start();
        circleImageView.setImageDrawable(mProgress);

```
